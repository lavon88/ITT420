package com.example.departmentitapp

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class CoursesDbHelper(context: Context) : SQLiteOpenHelper(context, "courses.db", null, 1) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE courses (code TEXT, name TEXT, credits INTEGER, prereq TEXT, description TEXT)")
        db.execSQL("INSERT INTO courses VALUES ('ITT101', 'Intro to Computing', 3, '', 'Basic computing principles')")
        db.execSQL("INSERT INTO courses VALUES ('ITT102', 'Programming I', 3, 'ITT101', 'Intro to programming')")
        db.execSQL("INSERT INTO courses VALUES ('ITT103', 'Computer Essentials', 3, 'ITT101', 'Basic computing troubleshooting')")
        db.execSQL("INSERT INTO courses VALUES ('ITT104', 'Network Communications', 3, 'ITT103', 'Computer networking')")
        db.execSQL("INSERT INTO courses VALUES ('ITT105', 'Programming 2', 3, 'ITT102', 'Basic computing principles')")
        db.execSQL("INSERT INTO courses VALUES ('ITT106', 'Internet Authoring', 3, 'ITT104', 'Intro to Webpage design and internet')")
        db.execSQL("INSERT INTO courses VALUES ('ITT107', 'Appliation Design', 3, 'ITT105', 'Creating Applications')")
        db.execSQL("INSERT INTO courses VALUES ('ITT108', 'Cyber Security', 3, 'ITT107', 'Study of malicious codes and applications')")
        db.execSQL("INSERT INTO courses VALUES ('ITT109', 'Machine Learning', 3, 'ITT102', 'Basic computing principles')")
        db.execSQL("INSERT INTO courses VALUES ('ITT110', 'Cloud Computing', 3, 'ITT104', 'Intro to cloud computers')")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS courses")
        onCreate(db)
    }

    fun getAllCourses(): List<Course> {
        val db = readableDatabase
        val cursor = db.rawQuery("SELECT * FROM courses", null)
        val list = mutableListOf<Course>()
        while (cursor.moveToNext()) {
            list.add(
                Course(
                    cursor.getString(0),
                    cursor.getString(1),
                    cursor.getInt(2).toString(),
                    cursor.getString(3),
                    cursor.getString(4)
                )
            )
        }
        cursor.close()
        return list
    }
}
