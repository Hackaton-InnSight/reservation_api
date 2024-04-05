package org.innsight.reservation_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "restaurants")
public class RestaurantModel {


    @Id
    private Long id;
    private String name;
    private List<Table> tables;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
