package com.flavio.ziele.controller

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/goals")
class GoalController {
    val goals: MutableList<GoalTO> = mutableListOf(
            GoalTO("travel", "Travel to Japan", false),
            GoalTO("edu", "Learn k8s", false),
            GoalTO("health", "achieve 3 consecutive months of training", false)
    )

    @GetMapping
    fun allGoals(): List<*> {
        return goals
    }

    @PostMapping
    fun addGoal(@RequestBody goal: GoalTO) {
        goals.add(goal)
    }
}