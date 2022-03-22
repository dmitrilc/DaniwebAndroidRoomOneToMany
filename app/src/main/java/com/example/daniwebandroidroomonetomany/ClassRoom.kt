package com.example.daniwebandroidroomonetomany

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "class_room")
data class ClassRoom(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "class_room_id")
    val classRoomId: Long = 0
)
