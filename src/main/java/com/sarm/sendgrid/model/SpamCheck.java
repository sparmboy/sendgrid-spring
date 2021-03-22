package com.sarm.sendgrid.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SpamCheck {
    /**
     * Indicates if this setting is enabled.
     */
    private Boolean enable;//            optional

    /**
     * The threshold used to determine if your content qualifies as spam on a scale from 1 to 10, with 10 being most strict, or most likely to be considered as spam.
     */
    private Integer threshold;//    minimum: 1,     maximum: 10,     optional

    /**
     * An Inbound Parse URL that you would like a copy of your email along with the spam report to be sent to.
     */
    private String post_to_url;//    optional


}
