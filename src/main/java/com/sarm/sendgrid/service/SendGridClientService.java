package com.sarm.sendgrid.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sarm.sendgrid.model.*;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGridAPI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.util.CollectionUtils.isEmpty;

@Slf4j
@Service
public class SendGridClientService {

    private static final String HEADER_X_MESSAGE_ID = "x-message-id";
    protected static final String HEADER_MESSAGE_ID = "X-Message-Id";
    public static final String EMAIL_AUDIT_DB_ID = "email_audit_id";

    @Autowired
    private SendGridAPI sendGrid;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Value("${sendgrid.defaultFrom}")
    private String defaultFromEmail;

    @Value("${sendgrid.defaultName}")
    private String defaultFromName;

    @Value("${sendgrid.defaultTemplateId:}")
    private String defaultTemplateId;

    public void send(EmailRequest emailRequest) throws IOException {
        log.debug("Building email request for send grid: {}", emailRequest);
        if (isEmpty(emailRequest.getRecipients())) {
            log.info("No recipients specified so nothing to send");
            return;
        }

        SendGridRequestBody requestBody = SendGridRequestBody.builder()
                .personalizations(getPersonalizations(emailRequest))
                .from(From.builder().email(emailRequest.getFrom()).name(defaultFromName).build())
                .template_id(emailRequest.getTemplateId() == null ? defaultTemplateId : emailRequest.getTemplateId())
                .reply_to(ReplyTo.builder().email(defaultFromEmail).name(defaultFromName).build())
                .build();


        attemptSend(requestBody, System.currentTimeMillis());
    }

    private void attemptSend(final SendGridRequestBody requestBody, final Long emailAuditBatchId) throws IOException {
        int retryCount = 0;
        String correlationId = "";
        String requestPayload = objectMapper.writeValueAsString(requestBody);
        log.debug("Sending message for batch id {}", emailAuditBatchId);

        Request request = new Request();
        request.setMethod(Method.POST);
        request.addHeader(HEADER_X_MESSAGE_ID, "" + emailAuditBatchId);
        request.setEndpoint("mail/send");

        log.trace("Sendgrid request payload: {}", requestPayload);
        request.setBody(requestPayload);
        Response response = sendGrid.api(request);
        correlationId = response.getHeaders().get(HEADER_MESSAGE_ID);
        log.debug("Send grid response code {} and message id {}", response.getStatusCode(), correlationId);
    }

    private List<Personalization> getPersonalizations(EmailRequest emailRequest) {
        return emailRequest.getRecipients().stream()
                .map(emailRecipient -> generatePersonalization(emailRequest, emailRecipient))
                .collect(Collectors.toList());
    }

    private Personalization generatePersonalization(EmailRequest emailRequest, EmailRecipient emailRecipient) {
        return Personalization.builder()
                .to(Arrays.asList(To.builder().email(emailRecipient.getEmail()).name(emailRecipient.getName()).build()))
                .cc(
                        emailRequest.getCc() == null ? null :
                                Arrays.asList(
                                        CC.builder()
                                                .email(emailRequest.getCc())
                                                .build())
                )
                .dynamic_template_data(getDynamicTemplateData(emailRequest, emailRecipient))
                .subject( emailRequest.getSubject())
                .custom_args(emailRecipient != null ? getCustomArgs(emailRecipient) : null)
                .build();
    }

    public HashMap getDynamicTemplateData(EmailRequest emailRequest, EmailRecipient to) {
        return new HashMap<String, Object>() { };
    }

    private HashMap getCustomArgs(EmailRecipient emailRecipient) {
        HashMap map = new HashMap<String, String>();
        if (emailRecipient.getEmailAuditDbId() != null) {
            map.put(EMAIL_AUDIT_DB_ID, "" + emailRecipient.getEmailAuditDbId());
        }

        return map;
    }
}