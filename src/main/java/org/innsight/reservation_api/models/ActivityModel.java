package org.innsight.reservation_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity(name = "activities")
public class ActivityModel {
    private String activityName;
    private String activityDescription;
    private Long activityPrice;
    private String activityDuration;
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
