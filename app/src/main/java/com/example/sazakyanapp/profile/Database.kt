package com.example.sazakyanapp.profile

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.core.content.contentValuesOf

class Database (context: Context) : SQLiteOpenHelper (context, "profile.db", null, 1) {
    override fun onCreate(p0: SQLiteDatabase?) {

        p0?.execSQL("create table userData (username TEXT primary key, password TEXT)")

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

        p0?.execSQL("drop table if exists userData")

    }

    fun insertdata(username: String, password: String): Boolean {

        val p0 = this.writableDatabase
        val cv = ContentValues()
        cv.put("username", username)
        cv.put("password", password)
        val result = p0.insert("userData", null, cv)

        if (result == -1.toLong()) {

            return false

        }

        return true

    }

    fun checkuserpass(username: String, password: String): Boolean {

        val p0 = this.writableDatabase
        val query = "select * from userData where username = '$username' and password = '$password'"
        val cursor = p0.rawQuery(query, null)

        if (cursor.count <= 0) {

            cursor.close()
            return false
        }

        cursor.close()
        return true

    }

}