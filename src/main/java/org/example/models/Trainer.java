package org.example.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
public class Trainer extends User{
    private String specialization;
    private long userId;
    private TrainingType trainingType;
}