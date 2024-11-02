package com.example.cmr.controller

import com.example.cmr.dto.ExerciseSessionDto
import com.example.cmr.dto.UserDto
import com.example.cmr.entity.ExerciseSession
import com.example.cmr.entity.User
import com.example.cmr.response.JsendResponse
import com.example.cmr.service.ProjectService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@Api(value = "Project Controller", description = "Operations pertaining to project management")
@RestController
@RequestMapping("/api")
class ProjectController {
    @Autowired
    lateinit var projectService: ProjectService

    @ApiOperation(value = "Get user by ID", response = User::class)
    @ApiResponses(value = [
        ApiResponse(code = 200, message = "Successfully retrieved user"),
        ApiResponse(code = 404, message = "User not found")
    ])
    @GetMapping("/users/{id}")
    fun getUserById(@PathVariable id: Long): JsendResponse<User> {
        val user = projectService.getUserById(id)
        return JsendResponse(status = "success", data = user)
    }

    @ApiOperation(value = "Create a new user", response = User::class)
    @ApiResponses(value = [
        ApiResponse(code = 200, message = "Successfully created user"),
        ApiResponse(code = 400, message = "Invalid input")
    ])
    @PostMapping("/users")
    fun createUser(@RequestBody @Valid userDto: UserDto): JsendResponse<User> {
        val user = projectService.createUser(userDto)
        return JsendResponse(status = "success", data = user)
    }

    @ApiOperation(value = "Get exercise session by ID", response = ExerciseSession::class)
    @ApiResponses(value = [
        ApiResponse(code = 200, message = "Successfully retrieved exercise session"),
        ApiResponse(code = 404, message = "Exercise session not found")
    ])
    @GetMapping("/sessions/{id}")
    fun getExerciseSessionById(@PathVariable id: Long): JsendResponse<ExerciseSession> {
        val session = projectService.getExerciseSessionById(id)
        return JsendResponse(status = "success", data = session)
    }

    @ApiOperation(value = "Create a new exercise session", response = ExerciseSession::class)
    @ApiResponses(value = [
        ApiResponse(code = 200, message = "Successfully created exercise session"),
        ApiResponse(code = 400, message = "Invalid input")
    ])
    @PostMapping("/sessions")
    fun createExerciseSession(@RequestBody @Valid exerciseSessionDto: ExerciseSessionDto): JsendResponse<ExerciseSession> {
        val session = projectService.createExerciseSession(exerciseSessionDto)
        return JsendResponse(status = "success", data = session)
    }
}