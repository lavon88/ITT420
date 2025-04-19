package com.example.departmentitapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CoursesAdapter(private val courseList: List<Course>) :
    RecyclerView.Adapter<CoursesAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val code: TextView = view.findViewById(R.id.tvCourse_Code)
        val name: TextView = view.findViewById(R.id.tvCourse_Name)
        val credits: TextView = view.findViewById(R.id.tvCredits)
        val prereqs: TextView = view.findViewById(R.id.tvPrerequisites)
        val description: TextView = view.findViewById(R.id.tvDescription)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_course, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val course = courseList[position]
        holder.code.text = "Code: ${course.code}"
        holder.name.text = "Name: ${course.name}"
        holder.credits.text = "Credits: ${course.credits}"
        holder.prereqs.text = "Pre-reqs: ${course.prerequisites}"
        holder.description.text = "Description: ${course.description}"

    }

    override fun getItemCount(): Int = courseList.size
}
