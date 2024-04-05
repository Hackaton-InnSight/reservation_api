package org.innsight.reservation_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "tables")
public class TableModel {

    @Id
    private Long id;
    private double capacity;
    @OneToMany(mappedBy = "table")
    private List<RestaurantReservationModel> reservations;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
