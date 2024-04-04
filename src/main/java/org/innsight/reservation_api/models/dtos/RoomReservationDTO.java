package org.innsight.reservation_api.models.dtos;

import org.innsight.reservation_api.models.RoomReservationModel;

import java.time.LocalDate;
import java.util.List;

public class RoomReservationDTO {
    private Long id;
    private Long roomId;
    private String userFirstName;
    private String userLastName;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public RoomReservationDTO(RoomReservationModel roomReservationModel) {
        this.id = roomReservationModel.getId();
        this.roomId = roomReservationModel.getRoom().getRoomNumber();
        this.userFirstName = roomReservationModel.getUser().getFirstName();
        this.userLastName = roomReservationModel.getUser().getLastName();
        this.checkIn = roomReservationModel.getCheckIn();
        this.checkOut = roomReservationModel.getCheckOut();
    }

    public static List<RoomReservationDTO> fromList(List<RoomReservationModel> reservations) {
        return reservations.stream().map(RoomReservationDTO::new).toList();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
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
}
