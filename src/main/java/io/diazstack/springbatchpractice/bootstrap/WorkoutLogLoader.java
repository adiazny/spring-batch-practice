package io.diazstack.springbatchpractice.bootstrap;

import io.diazstack.springbatchpractice.domain.WorkoutLog;
import io.diazstack.springbatchpractice.repository.WorkoutLogRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.OffsetDateTime;

@Component
public class WorkoutLogLoader implements CommandLineRunner {

    private final WorkoutLogRepository workoutLogRepository;

    public WorkoutLogLoader(WorkoutLogRepository workoutLogRepository) {
        this.workoutLogRepository = workoutLogRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadWorkoutLogData();
    }

    private void loadWorkoutLogData() {
        if (workoutLogRepository.count() == 0) {
            workoutLogRepository.save(WorkoutLog.builder()
                    .title("Sunday WOD")
                    .sport("Crossfit")
                    .workoutDateTime(OffsetDateTime.now().minusMinutes(20L))
                    .duration(Duration.ofMinutes(30L))
                    .build());

            workoutLogRepository.save(WorkoutLog.builder()
                    .title("Long Run")
                    .sport("Run")
                    .workoutDateTime(OffsetDateTime.now().minusMinutes(20L))
                    .duration(Duration.ofMinutes(30L))
                    .build());

            workoutLogRepository.save(WorkoutLog.builder()
                    .title("Tempo Bike")
                    .sport("Bike")
                    .workoutDateTime(OffsetDateTime.now().minusMinutes(20L))
                    .duration(Duration.ofMinutes(30L))
                    .build());

            workoutLogRepository.save(WorkoutLog.builder()
                    .title("2400yd Swim")
                    .sport("Swim")
                    .workoutDateTime(OffsetDateTime.now().minusMinutes(20L))
                    .duration(Duration.ofMinutes(30L))
                    .build());

        }
    }
}
