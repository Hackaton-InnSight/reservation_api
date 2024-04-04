package org.innsight.reservation_api.repositories;

import org.innsight.reservation_api.models.ActivityReservationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityReservationRepository extends JpaRepository<ActivityReservationModel, Long>{
}
