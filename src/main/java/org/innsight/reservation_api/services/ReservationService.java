package org.innsight.reservation_api.services;

import org.innsight.reservation_api.models.ReservationModel;
import org.innsight.reservation_api.models.dtos.ReservationDTO;
import org.innsight.reservation_api.repositories.ReservationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationService {
    private final ReservationsRepository reservationsRepository;

    @Autowired
    public ReservationService(ReservationsRepository reservationsRepository) {
        this.reservationsRepository = reservationsRepository;
    }

    public Long addReservation(ReservationModel reservationModel) {
        return reservationsRepository.save(reservationModel).getId();
    }

    public List<ReservationDTO> getAllReservations(){
        return ReservationDTO.fromList(reservationsRepository.findAll());
    }
}
