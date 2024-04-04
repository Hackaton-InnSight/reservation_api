package org.innsight.reservation_api.controller;

import org.innsight.reservation_api.models.ReservationModel;
import org.innsight.reservation_api.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping("/add")
    public Long addReservation(@RequestBody ReservationModel reservationModel) {
        return reservationService.addReservation(reservationModel);
    }
    @GetMapping("/all")
    public ResponseEntity<Object> getAllReservations() {
        return ResponseEntity.ok(reservationService.getAllReservations());
    }
}
