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
public class SendGridRequestBody {
    /**
     * An array of messages and their metadata. Each object within personalizations can be thought of as an envelope - it defines who should receive an individual message and how that message should be handled.
     */
    private List<Personalization> personalizations;

    private From from;  // requried
    private ReplyTo reply_to; // Optional
    /**
     * The global, or “message level”, subject of your email. This may be overridden by personalizations[x].subject.
     */
    private String subject;

    /**
     * An array in which you may specify the content of your email. You can include multiple mime types of content, but you must specify at least one mime type. To include more than one mime type, simply add another object to the array containing the type and value parameters.
     */
    private List<Content> content;

    /**
     * An array of objects in which you can specify any attachments you want to include.
     */
    private List<Attachment> attachments;

    /**
     * The id of a template that you would like to use. If you use a template that contains a subject and content (either text or html), you do not need to specify those at the personalizations nor message level.
     */
    private String template_id;

    /**
     * An object of key/value pairs that define block sections of code to be used as dynamic_template_data. The key/value pairs must be strings.
     */
    private HashMap<String,String> sections; //            optional


    /**
     * An object containing key/value pairs of header names and the value to substitute for them. The Key/value pairs must be strings. You must ensure these are properly encoded if they contain unicode characters. Must not be one of the reserved headers.
     */
    private HashMap<String,String> headers; //    optional


    /**
     * An array of category names for this message. Each category name may not exceed 255 characters.
     */
    private List<String> categories; //    optional

    /**
     * Values that are specific to the entire send that will be carried along with the email and its activity data. Key/value pairs must be strings. Substitutions will not be made on custom arguments, so any string that is entered into this parameter will be assumed to be the custom argument that you would like to be used. This parameter is overridden by personalizations[x].custom_args if that parameter has been defined. Total custom args size may not exceed 10,000 bytes.
     */
    private String custom_args; //            optional

    /**
     * A unix timestamp allowing you to specify when you want your email to be delivered. This may be overridden by the personalizations[x].send_at parameter. You can't schedule more than 72 hours in advance. If you have the flexibility, it's better to schedule mail for off-peak times. Most emails are scheduled and sent at the top of the hour or half hour. Scheduling email to avoid those times (for example, scheduling at 10:53) can result in lower deferral rates because it won't be going through our servers at the same times as everyone else's mail.
     */
    private Integer send_at;//    optional

    /**
     * This ID represents a batch of emails to be sent at the same time. Including a batch_id in your request allows you include this email in that batch, and also enables you to cancel or pause the delivery of that batch. For more information, see https://sendgrid.com/docs/API_Reference/Web_API_v3/cancel_schedule_send.html
     */
    private String batch_id;//    optional

    /**
     * An object allowing you to specify how to handle unsubscribes.
     */
    private ASM asm;//    optional

    /**
     * The IP Pool that you would like to send this email from.
     */
    private String ip_pool_name; //    minLength: 2,    maxLength: 64,    optional

    /**
     * A collection of different mail settings that you can use to specify how you would like this email to be handled.
     */
    private MailSettings mail_settings; //    optional

    /**
     * Settings to determine how you would like to track the metrics of how your recipients interact with your email.
     */
    private TrackingSettings tracking_settings;//            optional


}
