package com.example.environmentchallenge.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Challenge::class], version = 1, exportSchema = false)
abstract class ChallengeDatabase : RoomDatabase() {

    abstract val challengeDatabaseDAO : ChallengeDatabaseDAO

    companion object {

        @Volatile
        private var INSTANCE: ChallengeDatabase? = null

        fun getInstance(context: Context): ChallengeDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if(instance == null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ChallengeDatabase::class.java,
                        "challenge_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }

}