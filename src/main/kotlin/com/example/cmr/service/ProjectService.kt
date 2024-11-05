
package com.example.cmr.service

import com.example.cmr.dto.ExerciseSessionDto
import com.example.cmr.dto.UserDto
import com.example.cmr.entity.ExerciseSession
import com.example.cmr.entity.User
import com.example.cmr.repository.ExerciseSessionRepository
import com.example.cmr.repository.UserRepository
import jakarta.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@Service
class ProjectService {
    @Autowired
    lateinit var userRepository: UserRepository

    @Autowired
    lateinit var exerciseSessionRepository: ExerciseSessionRepository

    @Transactional


    fun createUser(userDto: UserDto): User {
        val user = User().apply {
            fullName = userDto.fullName
            age = userDto.age
            diagnosis = userDto.diagnosis
        }
        return userRepository.save(user)
    }

    @Transactional
    fun getUserById(id: Long): User? {
        val user = userRepository.findById(id).orElse(null)
        user?.exerciseSessions?.size
        return user
    }

    @Transactional
    fun createExerciseSession(exerciseSessionDto: ExerciseSessionDto): ExerciseSession {
        val user = userRepository.findById(exerciseSessionDto.userId!!).orElseThrow { Exception("User not found") }
        val session = ExerciseSession().apply {
            this.user = user
            exerciseType = exerciseSessionDto.exerciseType?.toString()
            duration = exerciseSessionDto.duration
            correctAnswers = exerciseSessionDto.correctAnswers
            date = exerciseSessionDto.date?.let { LocalDate.parse(it, DateTimeFormatter.ISO_DATE) }
        }
        return exerciseSessionRepository.save(session)
    }

    @Transactional
    fun getExerciseSessionById(id: Long): ExerciseSession {
        return exerciseSessionRepository.findById(id).orElseThrow { Exception("Exercise session not found") }
    }
}