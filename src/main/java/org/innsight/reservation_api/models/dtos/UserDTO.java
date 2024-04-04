package org.innsight.reservation_api.models.dtos;

import org.innsight.reservation_api.models.UserModel;

import java.util.List;

public class UserDTO {
    private String firstName;
    private String lastName;
    private String email;
    private List<RoomReservationDTO> reservations;

    public UserDTO(UserModel userModel) {
        this.firstName = userModel.getFirstName();
        this.lastName = userModel.getLastName();
        this.email = userModel.getEmail();
        this.reservations = RoomReservationDTO.fromList(userModel.getReservations());
    }
    public static List<UserDTO> fromList(List<UserModel> users) {
        return users.stream().map(UserDTO::new).toList();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<RoomReservationDTO> getReservations() {
        return reservations;
    }

    public void setReservations(List<RoomReservationDTO> reservations) {
        this.reservations = reservations;
    }
}
