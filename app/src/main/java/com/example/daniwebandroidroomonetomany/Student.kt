package com.example.daniwebandroidroomonetomany

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "student")
data class Student(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "student_id")
    val studentId: Long = 0,
    val name: String,
    val age: Int,
    @ColumnInfo(name = "class_room_id") val classRoomId: Long
)
