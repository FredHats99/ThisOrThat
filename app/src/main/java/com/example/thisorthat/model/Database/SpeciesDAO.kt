package com.example.thisorthat.model.Database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.IGNORE
import androidx.room.Query

@Dao
interface SpeciesDAO {
    @Query("SELECT PowerBaseStat FROM species_table WHERE Name = :speciesName")
    fun getPBS(speciesName : String)
    @Query("SELECT ResistanceBaseStat FROM species_table WHERE Name = :speciesName")
    fun getRBS(speciesName: String)
    @Query("SELECT VelocityBaseStat FROM species_table WHERE Name = :speciesName")
    fun getVBS(speciesName: String)
    @Query("SELECT PowerThreshold FROM species_table WHERE Name = :speciesName")
    fun getPTHR(speciesName: String)
    @Query("SELECT ResistanceThreshold FROM species_table WHERE Name = :speciesName")
    fun getRTHR(speciesName: String)
    @Query("SELECT VelocityThreshold FROM species_table WHERE Name = :speciesName")
    fun getVTHR(speciesName: String)
    @Query("SELECT GrowthRate FROM species_table WHERE Name = :speciesName")
    fun getGRT(speciesName: String)
}