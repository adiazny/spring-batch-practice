package io.diazstack.springbatchpractice.api.service;

import io.diazstack.springbatchpractice.api.model.WorkoutLogDto;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.UUID;

@Service
public class WorkoutLogServiceImpl implements WorkoutLogService {

    @Override
    public WorkoutLogDto getWorkoutLog(UUID id) {
        return WorkoutLogDto.builder()
                .id(UUID.randomUUID())
                .title("Sunday WOD")
                .sport("Crossfit")
                .workoutDateTime(OffsetDateTime.now().minusMinutes(15L))
                .duration(Duration.ofMinutes(25L).plusSeconds(50L))
                .createdDate(OffsetDateTime.now())
                .description("This WOD was a hard one!")
                .build();
    }

    @Override
    public WorkoutLogDto saveNewWorkoutLog(WorkoutLogDto workoutLogDto) {
        //Todo: Impl save logic to persistence store
        System.out.println(workoutLogDto);
        return new WorkoutLogDto();
    }

    @Override
    public void updateWorkoutLog(UUID id, WorkoutLogDto workoutLogDto) {
        //Todo: Impl update logid to persistence store
        System.out.println("Updated: " + workoutLogDto);
    }

    @Override
    public void deleteByID(UUID id) {
        //Todo: Impl delete logic from persistence store
        System.out.println("WorkoutLog Deleted");
    }
}
