package com.sarm.sendgrid.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Content {
    /**
     * The mime type of the content you are including in your email. For example, “text/plain” or “text/html”.
     */
    private String type; //     minLength: 1,     required

    /**
     * The actual content of the specified mime type that you are including in your email.
     */
    private String value;//            minLength: 1,    required


}
