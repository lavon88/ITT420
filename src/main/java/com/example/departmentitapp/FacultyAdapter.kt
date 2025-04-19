package com.example.departmentitapp

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FacultyAdapter(private val facultyList: List<FacultyMember>) :
    RecyclerView.Adapter<FacultyAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.facultyName)
        val phone: TextView = view.findViewById(R.id.facultyPhone)
        val email: TextView = view.findViewById(R.id.facultyEmail)
        val photo: ImageView = view.findViewById(R.id.facultyPhoto)
        val btnEmail: Button = view.findViewById(R.id.btnEmail)
        val btnCall: Button = view.findViewById(R.id.btnCall)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_faculty, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val faculty = facultyList[position]
        holder.name.text = faculty.name
        holder.phone.text = faculty.phone
        holder.email.text = faculty.email
        holder.photo.setImageResource(faculty.photoRes)

        holder.btnEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:${faculty.email}")
                putExtra(Intent.EXTRA_SUBJECT, "Hello ${faculty.name}")
            }
            it.context.startActivity(intent)
        }

        holder.btnCall.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:${faculty.phone}")
            }
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = facultyList.size
}
