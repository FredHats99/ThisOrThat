package com.example.thisorthat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thisorthat.model.Exemplar
import com.example.thisorthat.model.Species

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val species1 = Species()
        species1.setSpeciesPBS(4)
        species1.setSpeciesRBS(4)
        species1.setSpeciesVBS(3)
        species1.setSpeciesGRT(2.4)
        val exemplar1 = Exemplar(species1)
        println("Name is: ${exemplar1.getName()}")
        println("Power is ${exemplar1.getPower()}")
        println("Resistance is ${exemplar1.getResistance()}")
        println("Velocity is ${exemplar1.getVelocity()}")
        exemplar1.levelUp()
        println("${exemplar1.getName()} has leveled up to LV.${exemplar1.getLevel()}")
        println("Power is ${exemplar1.getPower()}")
        println("Resistance is ${exemplar1.getResistance()}")
        println("Velocity is ${exemplar1.getVelocity()}")
    }

}