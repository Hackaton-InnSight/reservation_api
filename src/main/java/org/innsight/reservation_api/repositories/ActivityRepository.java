package org.innsight.reservation_api.repositories;

import org.innsight.reservation_api.models.ActivityModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends JpaRepository<ActivityModel, Long> {

}
