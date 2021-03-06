package io.diazstack.springbatchpractice.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class WorkoutLog {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length = 36, columnDefinition = "varchar", updatable = false, nullable = false)
    private UUID id;

    @Version
    private Integer version;

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp createdDate;
    @UpdateTimestamp
    private Timestamp lastModifiedDate;

    private String title;
    private String sport;
    private OffsetDateTime workoutDateTime;
    private Duration duration;
    private BigDecimal distance;
    private String description;

}
