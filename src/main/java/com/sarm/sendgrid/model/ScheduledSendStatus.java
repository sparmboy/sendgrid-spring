package com.sarm.sendgrid.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * Represents the status of a scheduled send
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ScheduledSendStatus {
    public enum SCHEDULE_STATUS {cancel,pause}
    private String batch_id;
    private SCHEDULE_STATUS status;
}
