package org.innsight.reservation_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "restaurants")
public class RestaurantModel {


    @Id
    private Long id;
    private String name;
    @OneToMany(mappedBy = "restaurantId")
    private List<TableModel> tables;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
