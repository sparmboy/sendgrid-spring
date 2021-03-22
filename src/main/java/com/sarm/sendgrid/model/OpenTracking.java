package com.sarm.sendgrid.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OpenTracking {
    /**
     * Indicates if this setting is enabled.
     */
    private Boolean enable;//            optional

    /**
     * Allows you to specify a substitution tag that you can insert in the body of your email at a location that you desire. This tag will be replaced by the open tracking pixel.
     */
    private String substitution_tag;//    optional


}
