package com.example.thisorthat.model

class Exemplar {
    private var level = 0
    private lateinit var species: Species
    private lateinit var name : String
    private var power = 0
    private var resistance = 0
    private var velocity = 0
    private var growthRate = 0F

    fun Exemplar(species: Species, level: Int, name: String, power: Int, resistance: Int, velocity: Int, growthRate: Float){
        this.species = species
        this.level = level
        this.name = name
        this.power = power
        this.resistance = resistance
        this.velocity = velocity
        this.growthRate = growthRate
    }



}