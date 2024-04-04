package org.innsight.reservation_api.controller;

import org.innsight.reservation_api.models.RoomReservationModel;
import org.innsight.reservation_api.services.RoomReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservations")
public class RoomReservationController {
    private final RoomReservationService roomReservationService;

    @Autowired
    public RoomReservationController(RoomReservationService roomReservationService) {
        this.roomReservationService = roomReservationService;
    }

    @PostMapping("/add")
    public Long addReservation(@RequestBody RoomReservationModel roomReservationModel) {
        return roomReservationService.addReservation(roomReservationModel);
    }
    @GetMapping("/all")
    public ResponseEntity<Object> getAllReservations() {
        return ResponseEntity.ok(roomReservationService.getAllReservations());
    }
}
