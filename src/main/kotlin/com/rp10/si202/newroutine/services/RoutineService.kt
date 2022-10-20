package com.rp10.si202.newroutine.services

import com.rp10.si202.newroutine.models.Routine
import com.rp10.si202.newroutine.repositories.RoutineRepository
import org.springframework.stereotype.Service

@Service
class RoutineService(private val routineRepository: RoutineRepository) {

    fun findAll() : List<Routine> {
        return routineRepository.findAll()
    }

    fun save(routine: Routine) : Long {
        val savedRoutine = routineRepository.save(routine)

        return savedRoutine.id!!
    }
}