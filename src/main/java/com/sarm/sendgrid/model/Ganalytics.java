package com.sarm.sendgrid.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ganalytics {
    /**
     * Indicates if this setting is enabled.
     */
    private Boolean enable; //            optional

    /**
     * Name of the referrer source. (e.g. Google, SomeDomain.com, or Marketing Email)
     */
    private String utm_source;//    optional

    /**
     * Name of the marketing medium. (e.g. Email)
     */
    private String utm_medium;//    optional

    /**
     * Used to identify any paid keywords.
     */
    private String utm_term;//    optional

    /**
     * Used to differentiate your campaign from advertisements.
     */
    private String utm_content;//            optional

    /**
     * The name of the campaign.
     */
    private String utm_campaign;//            optional


}
