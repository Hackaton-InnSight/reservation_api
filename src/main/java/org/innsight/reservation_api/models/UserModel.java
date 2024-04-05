package org.innsight.reservation_api.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    @OneToMany(mappedBy = "user")
    private List<RoomReservationModel> reservations;
    @OneToMany(mappedBy = "user")
    private List<RestaurantReservationModel> restaurantReservations;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<RoomReservationModel> getReservations() {
        return reservations;
    }

    public void setReservations(List<RoomReservationModel> reservations) {
        this.reservations = reservations;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<RestaurantReservationModel> getRestaurantReservations() {
        return restaurantReservations;
    }

    public void setRestaurantReservations(List<RestaurantReservationModel> restaurantReservations) {
        this.restaurantReservations = restaurantReservations;
    }
}
