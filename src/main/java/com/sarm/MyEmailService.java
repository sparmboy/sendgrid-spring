package com.sarm;

import com.sarm.sendgrid.model.EmailRecipient;
import com.sarm.sendgrid.model.EmailRequest;
import com.sarm.sendgrid.service.SendGridClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;
import java.util.Arrays;

@ComponentScan("com.sarm.sendgrid")
public class MyEmailService {
    @Autowired
    SendGridClientService sendGridClientService;

    public void sendExample() throws IOException {
        sendGridClientService.send(
                EmailRequest.builder()
                        .recipients(Arrays.asList(
                                EmailRecipient.builder()
                                        .name("Bob Chumley-Warner")
                                        .email("bcm@example.com")
                                        .build()))
                        .message("Hello bob")
                        .build()
        );
    }
}
