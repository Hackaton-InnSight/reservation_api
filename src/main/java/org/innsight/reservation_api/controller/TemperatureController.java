package org.innsight.reservation_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/temperature")
public class TemperatureController {

    @GetMapping("/current")
    public String getCurrentTemperature() {
        if(LocalDateTime.now().getHour() >= 8 && LocalDateTime.now().getHour() <= 20) {
            return "20°C";
        }
        if (LocalDateTime.now().getHour() > 20 && LocalDateTime.now().getHour() <= 23) {
            return "18°C";
        }
        if (LocalDateTime.now().getHour() >= 0 && LocalDateTime.now().getHour() < 8) {
            return "16°C";
        }
        return "Error";
    }
}
