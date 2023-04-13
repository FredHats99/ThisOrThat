package com.example.thisorthat.model

import kotlin.random.Random

class Exemplar(species: Species) {
    private var level = 0
    private lateinit var species: Species
    private lateinit var name : String
    private var power = 0
    private var resistance = 0
    private var velocity = 0
    private var growthRate = 0F
    private var statsEvaluator : StatsEvaluator = StatsEvaluator()

    init{
        spawn(species)
    }

    private fun spawn(species: Species) {
        this.level = 1
        this.species = species
        this.name = "Cane"
        this.growthRate = species.getSpeciesGRT().toFloat()
        this.power = statsEvaluator.Evaluate(species, this.level, "power")
        this.resistance = statsEvaluator.Evaluate(species, this.level, "resistance")
        this.velocity = statsEvaluator.Evaluate(species, this.level, "velocity")
    }

    fun levelUp(){
        this.level++
        this.power = statsEvaluator.Evaluate(species, this.level, "power")
        this.resistance = statsEvaluator.Evaluate(species, this.level, "resistance")
        this.velocity = statsEvaluator.Evaluate(species, this.level, "velocity")
    }
    fun getLevel(): Int {
        return this.level
    }
    fun getName(): String {
        return this.name
    }
    fun getPower() : Int{
        return this.power
    }
    fun getResistance(): Int {
        return this.resistance
    }
    fun getVelocity(): Int {
        return this.velocity
    }
}