package com.sarm.sendgrid.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubscriptionTracking {
    /**
     * Indicates if this setting is enabled.
     */
    private Boolean enable;//            optional

    /**
     * Text to be appended to the email, with the subscription tracking link. You may control where the link is by using the tag <% %>
     */
    private String text;//    optional

    /**
     * HTML to be appended to the email, with the subscription tracking link. You may control where the link is by using the tag <% %>
     */
    private String html;//    optional

    /**
     * A tag that will be replaced with the unsubscribe URL. for example: [unsubscribe_url]. If this parameter is used, it will override both the text and html parameters. The URL of the link will be placed at the substitution tag’s location, with no additional formatting.
     */
    private String substitution_tag;//            optional


}
