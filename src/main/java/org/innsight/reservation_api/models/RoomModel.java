package org.innsight.reservation_api.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "rooms")
public class RoomModel {
    @Id
    private Long roomNumber;
    private String roomCapacity;
    private String roomSuperficy;
    @ElementCollection
    private List<String> bedType;
    private Boolean television;
    private Boolean airConditioning;
    private Boolean wifi;
    private Boolean bathroom;
    private String roomPricePerNight;
    @OneToMany(mappedBy = "room")
    private List<ReservationModel> reservations;

    public RoomModel() {
    }

    public Long getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Long roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(String roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public String getRoomSuperficy() {
        return roomSuperficy;
    }

    public void setRoomSuperficy(String roomSuperficy) {
        this.roomSuperficy = roomSuperficy;
    }

    public String getRoomPricePerNight() {
        return roomPricePerNight;
    }

    public void setRoomPricePerNight(String roomPricePerNight) {
        this.roomPricePerNight = roomPricePerNight;
    }

    public List<ReservationModel> getReservations() {
        return reservations;
    }

    public void setReservations(List<ReservationModel> reservations) {
        this.reservations = reservations;
    }

    public List<String> getBedType() {
        return bedType;
    }

    public void setBedType(List<String> bedType) {
        this.bedType = bedType;
    }

    public Boolean getTelevision() {
        return television;
    }

    public void setTelevision(Boolean television) {
        this.television = television;
    }

    public Boolean getAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(Boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public Boolean getBathroom() {
        return bathroom;
    }

    public void setBathroom(Boolean bathroom) {
        this.bathroom = bathroom;
    }
}
