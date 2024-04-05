package org.innsight.reservation_api.repositories;

import org.innsight.reservation_api.models.RoomModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface RoomsRepository extends JpaRepository<RoomModel, Long>{
}
