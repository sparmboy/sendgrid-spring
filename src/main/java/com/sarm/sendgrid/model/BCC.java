package com.sarm.sendgrid.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BCC {
    /**
     * format: email
     */
    private String email; //              required
    /**
     * The name of the person or company that is sending the email.
     */
    private String name;//    optional
}
