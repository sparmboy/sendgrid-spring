package com.sarm.sendgrid.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * Represents all the details of an email message
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmailDetails {
    private String msg_id;
    private String from_email;
    private String subject;
    private String to_email;
    private String status;
    private String template_id;
    private String asm_group_id;
    private String teammate;
    private String api_key_id;
    private List<Map<String,String>> events;
    private String originating_ip;
    private List<String> categories;
    private Map<String,String> unique_args;
    private String outbound_ip;
    private String outbound_ip_type;
    private String marketing_campaign_id;
    private String marketing_campaign_name;
    private String marketing_campaign_split_id;
    private String marketing_campaign_version;

}
