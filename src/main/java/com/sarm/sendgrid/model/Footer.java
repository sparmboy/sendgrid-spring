package com.sarm.sendgrid.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Footer {
    /**
     * Indicates if this setting is enabled.
     */
    private Boolean enable;//            optional

    /**
     * The plain text content of your footer.
     */
    private String text;//            optional

    /**
     * The HTML content of your footer.
     */
    private String html; // optional

}
