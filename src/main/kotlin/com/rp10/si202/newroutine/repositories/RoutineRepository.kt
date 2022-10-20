package com.rp10.si202.newroutine.repositories

import com.rp10.si202.newroutine.models.Routine
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RoutineRepository : JpaRepository<Routine, Long>