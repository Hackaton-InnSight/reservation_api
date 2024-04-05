package org.innsight.reservation_api.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tables")
public class TableModel {

    @Id
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
}
