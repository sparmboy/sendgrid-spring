package com.sarm.sendgrid.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;

/**
 * Represents the request object for sending commands to the
 * sendgrid API (not sure why this isnt in their java libraries but there you go)
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmailActivityQueryResponseBody {
    /**
     * An array of messages and their metadata.
     */
    private List<EmailActivityQueryResult> messages;
}
