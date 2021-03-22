package com.sarm.sendgrid.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ASM {
    /**
     * The unsubscribe group to associate with this email.
     */
    private Integer group_id; //             required

    /**
     * An array containing the unsubscribe groups that you would like to be displayed on the unsubscribe preferences page.
     */
    private List<Integer> groups_to_display; //    maxItems: 25,     optional
}
