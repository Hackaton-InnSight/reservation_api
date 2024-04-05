package org.innsight.reservation_api.controller;

import org.innsight.reservation_api.models.ActivityReservationModel;
import org.innsight.reservation_api.services.ActivityReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/activity-reservations")
public class ActivityReservationController {
    private final ActivityReservationService activityReservationService;

    @Autowired
    public ActivityReservationController(ActivityReservationService activityReservationService) {
        this.activityReservationService = activityReservationService;
    }

    @GetMapping("/all")
    public ResponseEntity<Object> getAllActivityReservations() {
        return ResponseEntity.ok(activityReservationService.getAllActivityReservations());
    }
    @PostMapping("/add")
    public ActivityReservationModel addActivityReservation(@RequestBody ActivityReservationModel activityReservation) {
        return activityReservationService.add(activityReservation);
    }
}
