package org.innsight.reservation_api.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "rooms")
public class RoomModel {
    @Id
    private Long roomNumber;
    private String roomName;
    private String roomCapacity;
    private String roomSuperficy;
    @ElementCollection
    private List<String> bedType;
    private String roomPricePerNight;
    private String description;
    private String description2;
    @OneToMany(mappedBy = "room")
    private List<RoomReservationModel> reservations;

    public RoomModel() {
    }

    public Long getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Long roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
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

    public List<RoomReservationModel> getReservations() {
        return reservations;
    }

    public void setReservations(List<RoomReservationModel> reservations) {
        this.reservations = reservations;
    }

    public List<String> getBedType() {
        return bedType;
    }

    public void setBedType(List<String> bedType) {
        this.bedType = bedType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }
}
