package io.diazstack.springbatchpractice.api.controller;

import io.diazstack.springbatchpractice.api.model.WorkoutLogDto;
import io.diazstack.springbatchpractice.api.service.WorkoutLogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/workoutlog")
public class WorkoutLogController {

    private final WorkoutLogService workoutLogService;

    public WorkoutLogController(WorkoutLogService workoutLogService) {
        this.workoutLogService = workoutLogService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkoutLogDto> getWorkoutLog(@PathVariable UUID id){
        return new ResponseEntity<>(workoutLogService.getWorkoutLog(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody WorkoutLogDto workoutLogDto){
        return new ResponseEntity<>(workoutLogService.saveNewWorkoutLog(workoutLogDto),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateWorkoutLog(@PathVariable UUID id, @RequestBody WorkoutLogDto workoutLogDto){
        workoutLogService.updateWorkoutLog(id, workoutLogDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteWorkoutLog(@PathVariable UUID id){
        workoutLogService.deleteByID(id);
    }

}
