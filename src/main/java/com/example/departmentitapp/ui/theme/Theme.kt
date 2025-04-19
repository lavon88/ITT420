package com.example.departmentitapp.ui.theme

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.departmentitapp.R

class ThemeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) 

       
        val colorPrimary = resources.getColor(R.color.purple_500)
        val colorAccent = resources.getColor(R.color.teal_200)
    }
}
