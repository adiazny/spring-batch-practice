package io.diazstack.springbatchpractice.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WorkoutLogDto {

    private UUID id;
    private Integer version;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;

    private String title;
    private String sport;
    private OffsetDateTime workoutDateTime;
    private Duration duration;
    private BigDecimal distance;
    private String description;
}
