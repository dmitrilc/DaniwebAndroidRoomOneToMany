package com.example.daniwebandroidroomonetomany

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface StudentDao {
    @Insert
    suspend fun insertStudents(vararg students: Student)
}