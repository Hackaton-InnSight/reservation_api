package org.innsight.reservation_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "activity_reservations")
public class ActivityReservationModel {
    @Id
    private Long id;
    @ManyToOne(targetEntity = ActivityModel.class)
    private Long activityId;
    private Long userId;
    private LocalDateTime reservationDate;
    private LocalDateTime reservationTime;
    private Long reservationPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LocalDateTime getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(LocalDateTime reservationTime) {
        this.reservationTime = reservationTime;
    }

    public Long getReservationPrice() {
        return reservationPrice;
    }

    public void setReservationPrice(Long reservationPrice) {
        this.reservationPrice = reservationPrice;
    }

}
