package org.innsight.reservation_api.models.dtos;

import org.innsight.reservation_api.models.RoomModel;

import java.util.List;

public class RoomDTO {
    private Long roomNumber;
    private String roomCapacity;
    private String roomSuperficy;
    private List<String> bedType;
    private String description;
    private String description2;
    private String roomPrice;
    private List<RoomReservationDTO> reservations;

    public RoomDTO(RoomModel roomModel) {
        this.roomNumber = roomModel.getRoomNumber();
        this.roomCapacity = roomModel.getRoomCapacity();
        this.roomSuperficy = roomModel.getRoomSuperficy();
        this.roomPrice = roomModel.getRoomPricePerNight();
        this.bedType = roomModel.getBedType();
        this.description = roomModel.getDescription();
        this.description2 = roomModel.getDescription2();
        this.reservations = RoomReservationDTO.fromList(roomModel.getReservations());
    }
    public static List<RoomDTO> fromList(List<RoomModel> rooms) {
        return rooms.stream().map(RoomDTO::new).toList();
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

    public List<RoomReservationDTO> getReservations() {
        return reservations;
    }

    public void setReservations(List<RoomReservationDTO> reservations) {
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
