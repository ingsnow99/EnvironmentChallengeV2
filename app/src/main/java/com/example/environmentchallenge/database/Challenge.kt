package com.example.environmentchallenge.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "challenge_table")
data class Challenge(
    @PrimaryKey(autoGenerate = true)
    var challengeId: Long = 0L,

    @ColumnInfo(name="challenge_desc")
    var challengeDesc: String
)