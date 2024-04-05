package org.innsight.reservation_api.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tables")
public class TableModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double capacity;
    @OneToMany(mappedBy = "tableId")
    private List<RestaurantReservationModel> reservations;
    @ManyToOne(targetEntity = RestaurantModel.class)
    private Long restaurantId;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public List<RestaurantReservationModel> getReservations() {
        return reservations;
    }

    public void setReservations(List<RestaurantReservationModel> reservations) {
        this.reservations = reservations;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }
}
