package org.innsight.reservation_api.services;

import org.innsight.reservation_api.models.ActivityModel;
import org.innsight.reservation_api.repositories.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {
    private final ActivityRepository activityRepository;
    @Autowired
    public ActivityService(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }


    public Long addActivity(ActivityModel activity) {
        return activityRepository.save(activity).getId();
    }

    public ActivityModel getActivity(Long id) {
        return activityRepository.findById(id).orElse(null);
    }

    public List<ActivityModel> getAllActivities() {
        return activityRepository.findAll();
    }
}
