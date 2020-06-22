package io.diazstack.springbatchpractice.repository;

import io.diazstack.springbatchpractice.domain.WorkoutLog;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface WorkoutLogRepository extends PagingAndSortingRepository<WorkoutLog, UUID> {

}
