package com.sarm.sendgrid.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;

/**
 * Represents the response object for fetching batch ids
 * sendgrid API (not sure why this isnt in their java libraries but there you go)
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BatchIdResponseBody {

    /**
     * This ID represents a batch of emails to be sent at the same time. Including a batch_id in your request allows you include this email in that batch, and also enables you to cancel or pause the delivery of that batch. For more information, see https://sendgrid.com/docs/API_Reference/Web_API_v3/cancel_schedule_send.html
     */
    private String batch_id;

    /**
     * An object allowing you to specify how to handle unsubscribes.
     */
    private String status;

}
