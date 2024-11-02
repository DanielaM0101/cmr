package com.example.cmr.repository

import com.example.cmr.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface UserRepository: JpaRepository <User, Long>


