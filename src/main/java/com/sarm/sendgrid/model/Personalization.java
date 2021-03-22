package com.sarm.sendgrid.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Personalization {
    /**
     * An array of recipients. Each object within this array may contain the name, but must always contain the email, of a recipient.
     */
    private List<To> to;//    required

    /**
     * An array of recipients who will receive a copy of your email. Each object within this array may contain the name, but must always contain the email, of a recipient.
     */
    private List<CC> cc;//    optional

    /**
     * An array of recipients who will receive a blind carbon copy of your email. Each object within this array may contain the name, but must always contain the email, of a recipient.
     */
    private List<BCC> bcc;//    optional

    /**
     * The subject of your email. Char length requirements, according to the RFC - http://stackoverflow.com/questions/1592291/what-is-the-email-subject-length-limit#answer-1592310
     */
    private String subject; //    minLength: 1,    optional

    /**
     * A collection of JSON key/value pairs allowing you to specify specific handling instructions for your email. You may not overwrite the following headers: x-sg-id, x-sg-eid, received, dkim-signature, Content-Type, Content-Transfer-Encoding, To, From, Subject, Reply-To, CC, BCC
     */
    private HashMap<String,String> headers;//            optional

    /**
     * A collection of key/value pairs following the pattern "substitution_tag":"value to substitute". The key/value pairs must be strings. These dynamic_template_data will apply to the text and html content of the body of your email, in addition to the subject and reply-to parameters. The total collective size of your dynamic_template_data may not exceed 10,000 bytes per personalization object.
     */
    private Map<String,Object> dynamic_template_data;//    maxProperties: 10000,     optional

    /**
     * Values that are specific to this personalization that will be carried along with the email and its activity data. Substitutions will not be made on custom arguments, so any string that is entered into this parameter will be assumed to be the custom argument that you would like to be used. May not exceed 10,000 bytes.
     */
    private Map<String,String> custom_args; //            optional

    /**
     * A unix timestamp allowing you to specify when you want your email to be delivered. Scheduling more than 72 hours in advance is forbidden.
     */
    private Integer send_at; //            optional


}
