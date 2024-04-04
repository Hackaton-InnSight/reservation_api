package org.innsight.reservation_api.models;

import jakarta.persistence.Entity;

import java.util.List;

@Entity(name = "activities")
public class ActivityModel {
    private String activityName;
    private String activityDescription;
    private Long activityPrice;
    private String activityDuration;
}
