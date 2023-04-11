package com.example.thisorthat.model

import java.util.jar.Attributes
import kotlin.properties.Delegates

abstract class Species {
    private lateinit var name : String
    private var speciesPBS = 0;
    private var speciesRBS = 0;
    private var speciesVBS = 0;
    private var speciesPTHR = 0;
    private var speciesRTHR = 0;
    private var speciesVTHR = 0;
    private var speciesGRT = 0;

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
    fun getSpeciesPTHR() : Int {
        return speciesPTHR
    }
    fun getSpeciesRTHR() : Int {
        return speciesRTHR
    }
    fun getSpeciesVTHR() : Int {
        return speciesVTHR
    }
    fun getSpeciesGRT() : Int {
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
    fun setSpeciesPTHR(speciesPTHR : Int){
        this.speciesPTHR = speciesPTHR
    }
    fun setSpeciesRTHR(speciesRTHR : Int){
        this.speciesRTHR = speciesRTHR
    }
    fun setSpeciesVTHR(speciesVTHR : Int){
        this.speciesVTHR = speciesVTHR
    }
    fun setSpeciesGRT(speciesGRT : Int){
        this.speciesGRT = speciesGRT
    }
}