package com.example.departmentitapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri

class AdmissionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admissions)

        findViewById<Button>(R.id.btnApply).setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, "https://ucc.edu.jm/apply/undergraduate/preform".toUri())
            startActivity(intent)
        }
    }
}