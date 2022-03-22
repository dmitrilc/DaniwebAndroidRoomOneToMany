package com.example.daniwebandroidroomonetomany

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import androidx.room.withTransaction
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

private const val TAG = "MAIN_ACTIVITY"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(
            applicationContext,
            MyDatabase::class.java, "my-database"
        ).build()

        lifecycleScope.launch(Dispatchers.IO) {
            val classRoomId = 1L
            val classRoom = ClassRoom(classRoomId)

            val studentA = Student(
                name = "John",
                age = 6,
                classRoomId = classRoomId
            )
            val studentB = studentA.copy(
                name = "Mary",
                age = 7
            )

            db.withTransaction {
                db.classRoomDao().insertClassRoom(classRoom)
                db.studentDao().insertStudents(studentA, studentB)
                val result = db.classRoomDao().getAllClassRoomWithStudent()
                Log.d(TAG, "$result")
            }
        }
    }
}