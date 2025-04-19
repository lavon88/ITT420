package com.example.departmentitapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CoursesActivity : AppCompatActivity() {
    private lateinit var dbHelper: CoursesDbHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        dbHelper = CoursesDbHelper(this)

        val courseList = dbHelper.getAllCourses()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewCourses)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CoursesAdapter(courseList)
    }
}
