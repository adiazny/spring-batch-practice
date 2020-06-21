package io.diazstack.springbatchpractice.api.controller;

import io.diazstack.springbatchpractice.api.model.WorkoutLogDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/workoutlog")
public class WorkoutLogController {

    @GetMapping("/{workoutlogid}")
    public ResponseEntity<WorkoutLogDto> getWorkoutLogDtoById(@PathVariable UUID workoutlogid){
        return new ResponseEntity<>(WorkoutLogDto.builder()
                .id(UUID.randomUUID())
                .title("Sunday WOD")
                .sport("Crossfit")
                .workoutDateTime(OffsetDateTime.now().minusMinutes(15L))
                .duration(Duration.ofMinutes(25L).plusSeconds(50L))
                .createdDate(OffsetDateTime.now())
                .description("This WOD was a hard one!")
                .build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<WorkoutLogDto> handlePost(@RequestBody WorkoutLogDto workoutLogDto){
        System.out.println(workoutLogDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
