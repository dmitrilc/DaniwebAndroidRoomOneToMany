package com.example.daniwebandroidroomonetomany

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ClassRoom::class, Student::class], version = 1)
abstract class MyDatabase : RoomDatabase() {
    abstract fun classRoomDao(): ClassRoomDao
    abstract fun studentDao(): StudentDao
}
