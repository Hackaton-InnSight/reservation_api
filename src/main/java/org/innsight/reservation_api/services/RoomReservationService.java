package org.innsight.reservation_api.services;

import org.innsight.reservation_api.models.RoomReservationModel;
import org.innsight.reservation_api.models.dtos.RoomReservationDTO;
import org.innsight.reservation_api.repositories.RoomReservationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomReservationService {
    private final RoomReservationsRepository roomReservationsRepository;

    @Autowired
    public RoomReservationService(RoomReservationsRepository roomReservationsRepository) {
        this.roomReservationsRepository = roomReservationsRepository;
    }

    public Long addReservation(RoomReservationModel roomReservationModel) {
        return roomReservationsRepository.save(roomReservationModel).getId();
    }

    public List<RoomReservationDTO> getAllReservations(){
        return RoomReservationDTO.fromList(roomReservationsRepository.findAll());
    }
}
