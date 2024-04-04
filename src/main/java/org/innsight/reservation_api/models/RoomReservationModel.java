package org.innsight.reservation_api.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "room_reservations")
public class RoomReservationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate checkIn;
    private LocalDate checkOut;
    @ManyToOne(targetEntity = UserModel.class)
    private UserModel user;
    @ManyToOne(targetEntity = RoomModel.class)
    private RoomModel room;

    public RoomReservationModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public RoomModel getRoom() {
        return room;
    }

    public void setRoom(RoomModel room) {
        this.room = room;
    }
}
