package com.example.thisorthat.model.Database

import android.content.Context
import androidx.room.*
import androidx.sqlite.db.SupportSQLiteOpenHelper
import java.security.AccessControlContext

@Database(entities = arrayOf(Species::class), version = 1, exportSchema = false)
public abstract class SpeciesDatabase : RoomDatabase() {
    abstract fun speciesDAO() : SpeciesDAO

    companion object{
        @Volatile
        private var INSTANCE : SpeciesDatabase? = null

        fun getDatabase(context: Context) : SpeciesDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    SpeciesDatabase::class.java,
                    "species_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }

    override fun createOpenHelper(config: DatabaseConfiguration?): SupportSQLiteOpenHelper {
        TODO("Not yet implemented")
    }

    override fun createInvalidationTracker(): InvalidationTracker {
        TODO("Not yet implemented")
    }

    override fun clearAllTables() {
        TODO("Not yet implemented")
    }
}