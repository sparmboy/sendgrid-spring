package com.sarm.sendgrid.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Represents an event object payload received from SendGrid email service
 */
@Data
public class SendGridEvent {
    private String email; // the email address of the recipient
    private String timestamp; // the UNIX timestamp of when the message was sent
    private String event; // the event type. Possible values are processed, dropped, delivered, deferred, bounce, open, click, spam report, unsubscribe, group unsubscribe, and group resubscribe.
    @JsonProperty("smtp-id")
    private String smtp_id; // a unique ID attached to the message by the originating system.
    private String useragent; // the user agent responsible for the event. This is usually a web browser. For example, "Mozilla/5.0 (Macintosh; Intel Mac OS X 1084) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/28.0.1500.95 Safari/537.36".
    private String IP; // the IP address used to send the email. For open and click events, it is the IP address of the recipient who engaged with the email.
    private String sg_event_id; // a unique ID to this event that you can use for deduplication purposes. These IDs are up to 100 characters long and are URL safe.
    private String sg_message_id; // a unique, internal SendGrid ID for the message. The first half of this is pulled from the smtp-id.
    private String reason; // any sort of error response returned by the receiving server that describes the reason this event type was triggered.
    private String status; // status code string. Corresponds to HTTP status code; // for example, a JSON response of 5.0.0 is the same as a 500 error response.
    private String response; // the full text of the HTTP response error returned from the receiving server.
    private String tls; // indicates whether TLS encryption was used in sending this message. For more information about TLS, see the TLS Glossary page.
    private String url; // the URL where the event originates. For click events, this is the URL clicked on by the recipient.
    private String attempt; // the number of times SendGrid has attempted to deliver this message.
    private String category; // Categories are custom tags that you set for the purpose of organizing your emails. If you send single categories as an array, they will be returned by the webhook as an array. If you send single categories as a string, they will be returned by the webhook as a string.
    private String type; // indicates whether the bounce event was a hard bounce (type=bounce) or block (type=blocked)
    private Integer asm_group_id;
    // Custom fields
    private String email_audit_id;
}
