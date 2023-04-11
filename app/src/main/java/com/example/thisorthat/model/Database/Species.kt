package com.example.thisorthat.model.Database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Species_table")
class Species (
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "Species") val species: Species?,
    @ColumnInfo(name = "Name") val name : String,
    @ColumnInfo(name = "PowerBaseStat") val pbs : Int,
    @ColumnInfo(name = "ResistanceBaseStat") val rbs : Int,
    @ColumnInfo(name = "VelocityBaseStat") val vbs : Int,
    @ColumnInfo(name = "PowerThreshold") val pthr : Int,
    @ColumnInfo(name = "ResistanceThreshold") val rthr : Int,
    @ColumnInfo(name = "VelocityThreshold") val vthr : Int,
    @ColumnInfo(name = "GrowthRate") val grt : Int
    )