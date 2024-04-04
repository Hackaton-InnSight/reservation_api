package org.innsight.reservation_api.controller;

import org.innsight.reservation_api.models.ActivityModel;
import org.innsight.reservation_api.services.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activities")
public class ActivityController {
    private final ActivityService activityService;
    @Autowired
    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @PostMapping("/add")
    public Long addActivity(@RequestBody ActivityModel activity) {
        return activityService.addActivity(activity);
    }
    @GetMapping("/{id}")
    public ActivityModel getActivity(@PathVariable Long id) {
        return activityService.getActivity(id);
    }
    @GetMapping("/all")
    public List<ActivityModel> getAllActivities() {
        return activityService.getAllActivities();
    }
}
