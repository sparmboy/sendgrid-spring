package com.sarm.sendgrid.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Represents the details returned from a message query
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmailActivityQueryResult {
    private String msg_id;
    private String from_email;
    private String subject;
    private String to_email;
    private String status;
    private String opens_count;
    private String clicks_count;
    private String last_event_time;

}
