package com.example.cmr.repository


import com.example.cmr.entity.ExerciseSession
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface ExerciseSessionRepository: JpaRepository<ExerciseSession, Long>

