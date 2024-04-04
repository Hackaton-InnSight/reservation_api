package org.innsight.reservation_api.repositories;

import org.innsight.reservation_api.models.ReservationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationsRepository extends JpaRepository<ReservationModel, Long> {
}
