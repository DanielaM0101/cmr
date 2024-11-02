package com.example.cmr.entity


import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonManagedReference
import jakarta.persistence.*
import java.time.LocalDate


@Entity
@Table(name = "exercise_session")
class ExerciseSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
    var user: User? = null

    @Column(nullable = false)
    var exerciseType: String? = null

    @Column(nullable = false)
    var duration: Int? = null

    @Column(nullable = false)
    var correctAnswers: Int? = null

    @Column(nullable = false)
    var date: LocalDate? = null
}