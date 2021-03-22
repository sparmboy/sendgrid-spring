package com.sarm.sendgrid.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmailRecipient {
    Long dbId;
    String name;
    String email;
    Long emailAuditDbId;
}
