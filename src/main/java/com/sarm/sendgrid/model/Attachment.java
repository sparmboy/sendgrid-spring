package com.sarm.sendgrid.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Attachment {
    /**
     * The Base64 encoded content of the attachment.
     */
    private String content; //            minLength: 1,     required

    /**
     * The mime type of the content you are attaching. For example, “text/plain” or “text/html”.
     */
    private String type;//     minLength: 1,     optional

    /**
     * The filename of the attachment.
     */
    private String filename; //            required

    /**
     * The content-disposition of the attachment specifying how you would like the attachment to be displayed. For example, “inline” results in the attached file being displayed automatically within the message while “attachment” results in the attached file requiring some action to be taken before it is displayed (e.g. opening or downloading the file).
     */
    private String disposition; //    Allowed Values: inline, attachment,     default: attachment,             optional

    /**
     * The content id for the attachment. This is used when the disposition is set to “inline” and the attachment is an image, allowing the file to be displayed within the body of your email.
     */
    private String content_id;//            optional


}
