package org.innsight.reservation_api.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "restaurants")
public class RestaurantModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TableModel> getTables() {
        return tables;
    }

    public void setTables(List<TableModel> tables) {
        this.tables = tables;
    }
}
