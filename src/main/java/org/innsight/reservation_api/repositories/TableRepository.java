package org.innsight.reservation_api.repositories;

import org.innsight.reservation_api.models.TableModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<TableModel, Long> {
}
