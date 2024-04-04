package org.innsight.reservation_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity(name = "activities")
public class ActivityModel {
    private String activityName;
    private String activityDescription;
    private Long activityPrice;
    private String activityDuration;
    @Id
    private Long id;
    @OneToMany(mappedBy = "activity_id")
    private List<ActivityReservationModel> reservations;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityDescription() {
        return activityDescription;
    }

    public void setActivityDescription(String activityDescription) {
        this.activityDescription = activityDescription;
    }

    public Long getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(Long activityPrice) {
        this.activityPrice = activityPrice;
    }

    public String getActivityDuration() {
        return activityDuration;
    }

    public void setActivityDuration(String activityDuration) {
        this.activityDuration = activityDuration;
    }
}
