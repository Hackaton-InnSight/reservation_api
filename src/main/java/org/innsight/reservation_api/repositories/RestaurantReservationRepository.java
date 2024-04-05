package org.innsight.reservation_api.repositories;

import org.innsight.reservation_api.models.RestaurantReservationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantReservationRepository extends JpaRepository<RestaurantReservationModel, Long> {
}
