package com.example.cmr.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class ExerciseSessionDto {

    @NotNull(message = "User id is required")
    var userId: Long? = null

    @NotNull(message = "Exercise id is required")
    var  exerciseType: Long? = null

    @NotNull(message = "Duration is required")
    var duration: Int? = null

    @NotNull(message = "Correct answers is required")
    var correctAnswers: Int? = null

    @NotNull(message = "Date is required")
    var date: String? = null
}