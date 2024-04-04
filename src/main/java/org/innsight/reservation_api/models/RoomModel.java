package org.innsight.reservation_api.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "rooms")
public class RoomModel {
    @Id
    private Long roomNumber;
    private String roomCapacity;
    private String roomSuperficy;
    private String roomPrice;
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

    public String getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(String roomPrice) {
        this.roomPrice = roomPrice;
    }

    public List<ReservationModel> getReservations() {
        return reservations;
    }

    public void setReservations(List<ReservationModel> reservations) {
        this.reservations = reservations;
    }
    @Override
    public String toString() {
        return "RoomModel{" +
                "roomNumber=" + roomNumber +
                ", roomCapacity='" + roomCapacity + '\'' +
                ", roomSuperficy='" + roomSuperficy + '\'' +
                ", roomPrice='" + roomPrice + '\'' +
                ", reservations=" + reservations +
                '}';
    }
}
