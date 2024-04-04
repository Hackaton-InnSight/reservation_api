package org.innsight.reservation_api.models.dtos;

import org.innsight.reservation_api.models.ReservationModel;

import java.time.LocalDate;
import java.util.List;

public class ReservationDTO {
    private Long id;
    private Long roomId;
    private String userFirstName;
    private String userLastName;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public ReservationDTO(ReservationModel reservationModel) {
        this.id = reservationModel.getId();
        this.roomId = reservationModel.getRoom().getRoomNumber();
        this.userFirstName = reservationModel.getUser().getFirstName();
        this.userLastName = reservationModel.getUser().getLastName();
        this.checkIn = reservationModel.getCheckIn();
        this.checkOut = reservationModel.getCheckOut();
    }

    public static List<ReservationDTO> fromList(List<ReservationModel> reservations) {
        return reservations.stream().map(ReservationDTO::new).toList();
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
