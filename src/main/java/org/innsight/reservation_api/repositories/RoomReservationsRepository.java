package org.innsight.reservation_api.repositories;

import org.innsight.reservation_api.models.RoomReservationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomReservationsRepository extends JpaRepository<RoomReservationModel, Long> {
    List<RoomReservationModel> findByUserEmail(String email);
}
