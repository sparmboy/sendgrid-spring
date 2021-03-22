package com.sarm.sendgrid.model;

import lombok.Builder;
import lombok.Data;

import java.io.File;
import java.net.URL;
import java.util.List;

@Builder
@Data
public class EmailRequest {
    List<EmailRecipient> recipients;
    String from;
    String subject;
    String subTitle;
    String message;
    String comment;
    String linkText;
    URL linkUrl;
    List<File> files;
    String cc;
    String templateId;
    private String salutations;
    private Integer unsubscribeId;
}
