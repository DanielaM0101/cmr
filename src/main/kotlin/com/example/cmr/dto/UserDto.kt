package com.example.cmr.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class UserDto {
    @NotBlank(message = "Full name is required")
    var fullName: String? = null

    @NotNull(message = "Age is required")
    var age: Int? = null

    var diagnosis : String? = null

    var exerciseSessions: List <ExerciseSessionDto> = emptyList()
}