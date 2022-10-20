package com.rp10.si202.newroutine.controller

import com.rp10.si202.newroutine.models.Routine
import com.rp10.si202.newroutine.services.RoutineService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("routines")
class RoutineController(private val routineService: RoutineService) {

    @GetMapping
    fun getRoutines() : ResponseEntity<List<Routine>> {
        val routines : List<Routine> = routineService.findAll()

        return ResponseEntity.ok(routines)
    }

    @PostMapping
    fun saveRoutines(routine: Routine) : ResponseEntity<Long> {
        val routineIdSaved = routineService.save(routine)

        return ResponseEntity.ok(routineIdSaved)
    }
}