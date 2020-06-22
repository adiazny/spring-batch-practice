package io.diazstack.springbatchpractice.api.service;

import io.diazstack.springbatchpractice.api.model.WorkoutLogDto;

import java.util.UUID;

public interface WorkoutLogService {

    WorkoutLogDto getWorkoutLog(UUID id);
    WorkoutLogDto saveNewWorkoutLog(WorkoutLogDto workoutLogDto);
    void updateWorkoutLog(UUID id, WorkoutLogDto workoutLogDto);
    void deleteByID(UUID id);
}
