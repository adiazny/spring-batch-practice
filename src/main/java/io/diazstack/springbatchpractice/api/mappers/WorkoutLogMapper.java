package io.diazstack.springbatchpractice.api.mappers;

import io.diazstack.springbatchpractice.api.model.WorkoutLogDto;
import io.diazstack.springbatchpractice.domain.WorkoutLog;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class )
public interface WorkoutLogMapper {

    WorkoutLogDto workoutLogToWorkoutLogDto(WorkoutLog workoutLog);
    WorkoutLog workoutLogDtoToWorkoutLog(WorkoutLogDto workoutLogDto);

}
