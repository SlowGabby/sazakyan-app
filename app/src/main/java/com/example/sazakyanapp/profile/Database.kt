package com.example.sazakyanapp.profile

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import androidx.core.content.contentValuesOf

class Database (context: Context) : SQLiteOpenHelper (context, "user.db", null, 1) {
    override fun onCreate(p0: SQLiteDatabase?) {

        p0?.execSQL("create table userData (username TEXT primary key, email TEXT, contact TEXT, password TEXT)")

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

        p0?.execSQL("drop table if exists userData")

    }

    fun insertdata(username: String, email: String, contact : String, password : String): Boolean {

        val p0 = this.writableDatabase
        val cv = ContentValues()
        cv.put("username", username)
        cv.put("email", email)
        cv.put("contact", contact)
        cv.put("password", password)
        val result = p0.insert("userData", null, cv)

        if (result == -1.toLong()) {
            Log.e("Database", "Error inserting data into userData table")
            return false

        }

        return true

    }

    fun checkuserpass(username: String, email: String, contact : String, password : String): Boolean {

        val p0 = this.writableDatabase
        val query =
            "select * from userData where username = '$username' and email = '$email' and contact = '$contact' and password = '$password'"
        val cursor = p0.rawQuery(query, null)

        if (cursor.count <= 0) {

            cursor.close()
            return false
        }

        cursor.close()
        return true

    }

    fun deleteUser(username : String) {
        val p0 = this.writableDatabase
        p0.delete("userData", "username=?", arrayOf(username))
        p0.close()
    }

    fun updateData( newPassword: String, username: String){
        val db = this.writableDatabase
        val values = ContentValues()

        values.put("password", newPassword)
        db.update("userData", values, "username=?" , arrayOf(username))
        db.close()
    }
}

