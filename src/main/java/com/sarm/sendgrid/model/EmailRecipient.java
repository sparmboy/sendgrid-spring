package com.sarm.sendgrid.model;

import lombok.Builder;
import lombok.Data;

import java.net.URL;
import java.util.Map;

@Data
@Builder
public class EmailRecipient {
    Long dbId;
    String name;
    String email;
    Long emailAuditDbId;
    URL customLinkUrl;
    private Map<String, String> customArgs;
}
