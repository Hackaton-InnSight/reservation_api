package org.innsight.reservation_api.services;

import org.innsight.reservation_api.repositories.RestaurantReservationRepository;
import org.springframework.stereotype.Service;

@Service
public class RestaurantReservationService {
    private final RestaurantReservationRepository restaurantReservationRepository;

    public RestaurantReservationService(RestaurantReservationRepository restaurantReservationRepository) {
        this.restaurantReservationRepository = restaurantReservationRepository;
    }
}
