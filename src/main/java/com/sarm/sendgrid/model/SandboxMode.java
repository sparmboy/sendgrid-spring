package com.sarm.sendgrid.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SandboxMode {
    /**
     * Indicates if this setting is enabled.
     */
    private Boolean enable; //            optional
}
