package com.sarm.sendgrid.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BCCEnabled {
    /**
     * Indicates if this setting is enabled.
     */
    private Boolean enable;//            optional

    /**
     * The email address that you would like to receive the BCC.
     */
    private String email; //            format: email,    optional
}
