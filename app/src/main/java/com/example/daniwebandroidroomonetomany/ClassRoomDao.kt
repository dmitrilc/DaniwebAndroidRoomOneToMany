package com.example.daniwebandroidroomonetomany

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface ClassRoomDao {
    @Insert
    suspend fun insertClassRoom(classRoom: ClassRoom)

    @Transaction
    @Query("SELECT * FROM class_room")
    suspend fun getAllClassRoomWithStudent(): List<ClassRoomWithStudent>
}