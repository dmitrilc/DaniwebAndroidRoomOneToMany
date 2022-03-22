package com.example.daniwebandroidroomonetomany

import androidx.room.Embedded
import androidx.room.Relation

data class ClassRoomWithStudent(
    @Embedded val classRoom: ClassRoom,
    @Relation(
        parentColumn = "class_room_id",
        entityColumn = "class_room_id"
    )
    val students: List<Student>
)
