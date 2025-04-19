package com.example.departmentitapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FacultyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faculty)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewFaculty)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = FacultyAdapter(getFacultyList())
    }

    private fun getFacultyList(): List<FacultyMember> {
        return listOf(
            FacultyMember("Dr. John Brown", "8769245614", "jbrown@ucc.edu.jm", R.drawable.profile1),
            FacultyMember("Dr. John Morris", "8763152478", "jmorris@ucc.edu.gh", R.drawable.profile2),
            FacultyMember("Dr. Shawna Campbell", "8765412657", "scampbell@ucc.edu.gh", R.drawable.profile3),
            FacultyMember("Dr. Nickesha Grant", "8769991254", "ngrant@ucc.edu.jm", R.drawable.profile4),
            FacultyMember("Prof. Mark Walker", "8765142206", "mwalker@ucc.edu.jm", R.drawable.profile5),
            FacultyMember("Prof. Paul Smith", "87651329", "psmith@ucc.edu.jm", R.drawable.profile6),
            FacultyMember("Prof. Carl Johnson", "8763658702", "cjohnson@ucc.edu.jm", R.drawable.profile7),
            FacultyMember("Prof. John Smith", "8764461230", "j.smith@ucc.edu.jm", R.drawable.profile8),
            FacultyMember("Prof. Kimesha Burke", "8767942128", "kburke@ucc.edu.jm", R.drawable.profile9),
            FacultyMember("Prof. Sasha Francis", "8767935594", "Sfrancis@ucc.edu.jm", R.drawable.profile10)
        )
    }
}