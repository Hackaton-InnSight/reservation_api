package org.innsight.reservation_api.repositories;

import org.innsight.reservation_api.models.RestaurantModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantModel, Long> {
}
