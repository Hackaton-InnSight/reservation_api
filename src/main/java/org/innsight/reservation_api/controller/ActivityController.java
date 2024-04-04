package org.innsight.reservation_api.controller;

import org.innsight.reservation_api.services.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activities")
public class ActivityController {
    private final ActivityService activityService;
    @Autowired
    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @PostMapping("/add")
    public Long addActivity() {
        return activityService.addActivity();
    }
}
