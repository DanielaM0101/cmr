package com.example.cmr.entity




import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonManagedReference
import jakarta.persistence.*


@Entity
@Table(name = "\"user\"")
class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(nullable = false)
    var fullName: String? = null

    @Column(nullable = false)
    var age: Int? = null

    var diagnosis : String? = null

    @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL], orphanRemoval = true)
    @JsonManagedReference

    var exerciseSessions: MutableList<ExerciseSession> = mutableListOf()


}