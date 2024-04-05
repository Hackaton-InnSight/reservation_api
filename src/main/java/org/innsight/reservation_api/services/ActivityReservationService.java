package org.innsight.reservation_api.services;

import org.innsight.reservation_api.models.ActivityReservationModel;
import org.innsight.reservation_api.repositories.ActivityReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityReservationService {
    private final ActivityReservationRepository activityReservationRepository;
    @Autowired
    public ActivityReservationService(ActivityReservationRepository activityReservationRepository) {
        this.activityReservationRepository = activityReservationRepository;
    }
    public Object getAllActivityReservations() {
        return activityReservationRepository.findAll();
    }

    public ActivityReservationModel add(ActivityReservationModel activityReservation) {
        return activityReservationRepository.save(activityReservation);
    }
}
