package com.example.departmentitapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Buttons to navigate to different Activities
        findViewById<Button>(R.id.btnFaculty).setOnClickListener {
            startActivity(Intent(this, FacultyActivity::class.java))
        }

        findViewById<Button>(R.id.btnCourses).setOnClickListener {
            startActivity(Intent(this, CoursesActivity::class.java))
        }

        findViewById<Button>(R.id.btnAdmissions).setOnClickListener {
            startActivity(Intent(this, AdmissionsActivity::class.java))
        }

        findViewById<Button>(R.id.btnSocialMedia).setOnClickListener {
            startActivity(Intent(this, SocialMediaActivity::class.java))
        }

        // Floating Action Button for sending email
        val fab: FloatingActionButton = findViewById(R.id.fabEmail)
        fab.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = "mailto:hod@ucc.edu.gh".toUri()
                putExtra(Intent.EXTRA_SUBJECT, "Inquiry from Student")
            }
            startActivity(emailIntent)
        }
    }
}
