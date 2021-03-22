package com.sarm.sendgrid.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TrackingSettings {

    /**
     * Allows you to track whether a recipient clicked a link in your email.
     */
    private ClickTracking click_tracking;//            optional

    /**
     * Allows you to track whether the email was opened or not, but including a single pixel image in the body of the content. When the pixel is loaded, we can log that the email was opened.
     */
    private OpenTracking open_tracking;//    optional

    /**
     * Allows you to insert a subscription management link at the bottom of the text and html bodies of your email. If you would like to specify the location of the link within your email, you may use the substitution_tag.
     */
    private SubscriptionTracking subscription_tracking;//    optional

    /**
     * Allows you to enable tracking provided by Google Analytics.
     */
    private Ganalytics ganalytics;//            optional
}
