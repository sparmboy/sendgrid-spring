package com.sarm.sendgrid.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClickTracking {
    /**
     * Indicates if this setting is enabled.
     */
    private Boolean enable;//            optional

    /**
     * Indicates if this setting should be included in the text/plain portion of your email.
     */
    private Boolean enable_text;//            optional


}
