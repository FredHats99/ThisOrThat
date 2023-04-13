package com.example.thisorthat.model

import java.util.jar.Attributes
import kotlin.properties.Delegates

class Species {
    private lateinit var name : String
    private var speciesPBS = 0;
    private var speciesRBS = 0;
    private var speciesVBS = 0;
    private var speciesGRT = 0.0;

    public fun Species(speciesName: String){
        name = speciesName
        //TODO: Retrieve information about species from a local db
    }

    fun getSpeciesPBS() : Int {
        return speciesPBS
    }
    fun getSpeciesRBS() : Int {
        return speciesRBS
    }
    fun getSpeciesVBS() : Int {
        return speciesVBS
    }
    fun getSpeciesGRT() : Double {
        return speciesGRT
    }
    fun setSpeciesPBS(speciesPBS : Int){
        this.speciesPBS = speciesPBS
    }
    fun setSpeciesRBS(speciesRBS : Int){
        this.speciesRBS = speciesRBS
    }
    fun setSpeciesVBS(speciesVBS : Int){
        this.speciesVBS = speciesVBS
    }
    fun setSpeciesGRT(speciesGRT: Double){
        this.speciesGRT = speciesGRT
    }
}