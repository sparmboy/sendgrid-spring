package com.sarm.sendgrid.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MailSettings {
    /**
     * This allows you to have a blind carbon copy automatically sent to the specified email address for every email that is sent.
     */
    private BCCEnabled bcc; // optional

    /**
     * Allows you to bypass all unsubscribe groups and suppressions to ensure that the email is delivered to every single recipient. This should only be used in emergencies when it is absolutely necessary that every recipient receives your email.
     */
    private BypassListManagement bypass_list_management; //    optional

    /**
     * The default footer that you would like included on every email.
     */
    private Footer footer;//            optional

    /**
     * This allows you to send a test email to ensure that your request body is valid and formatted correctly.
     */
    private SandboxMode sandbox_mode;//            optional

    /**
     * This allows you to test the content of your email for spam.
     */
    private SpamCheck spam_check;//            optional


}
