package com.example.thisorthat.model

import kotlin.math.exp
import kotlin.math.pow

class StatsEvaluator {
    fun Evaluate(species: Species, level: Int, stat: String): Int{
        var b = 0F
        var c = 0F
        var a = 0F
        when(stat){
            "power" -> {
                c = species.getSpeciesPBS().toFloat()
            }
            "resistance" -> {
                c = species.getSpeciesRBS().toFloat()
            }
            "velocity" -> {
                c = species.getSpeciesVBS().toFloat()
            }
        }
        b = species.getSpeciesGRT().toFloat()
        a = (-b/200)
        return (a* (level - 1).toDouble().pow(2.0).toInt() + b*(level-1) + c).toInt()
    }
}