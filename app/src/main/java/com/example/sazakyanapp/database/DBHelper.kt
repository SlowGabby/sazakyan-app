package com.example.sazakyanapp.database

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DBHelper ( context: Context):
        SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

            companion object {

                private const val DATABASE_NAME = "userDatabase.db"
                private const val DATABASE_VERSION = 1
                private const val TABLE_NAME = "data"
                private const val COLUMN_ID = "id"
                private const val COLUMN_USERNAME = "username"
                private const val COLUMN_PASSWORD = "password"
                private const val COLUMN_CPASSWORD = "cpassword"

            }

    override fun onCreate(db: SQLiteDatabase?) {

        val createTableQuery = ("CREATE_TABLE " + " $TABLE_NAME (" +
                " $COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                " $COLUMN_USERNAME TEXT, " +
                " $COLUMN_PASSWORD TEXT) " +
                " $COLUMN_CPASSWORD TEXT ")

        db?.execSQL(createTableQuery)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

        val dropTableQuery = "DROP TABLE IF EXISTS $TABLE_NAME"
        db?.execSQL(dropTableQuery)
        onCreate(db)

    }

    fun insertUser (username: String, password: String, confirmPassword: String) : Long {

        val values = ContentValues().apply {

            put (COLUMN_USERNAME, username)
            put (COLUMN_PASSWORD, password)
            put (COLUMN_CPASSWORD, confirmPassword)

        }

        val db = writableDatabase
        return db.insert(TABLE_NAME, null, values)

    }

    fun readUser (username: String, password: String, cpassword : String) : Boolean {

        val db = readableDatabase
        val selection = "$COLUMN_USERNAME = ? AND $COLUMN_PASSWORD = ? AND $COLUMN_CPASSWORD = ?"
        val selectionArgs = arrayOf(username, password, cpassword)
        val cursor = db.query(TABLE_NAME, null, selection, selectionArgs, null, null, null)

        val userExists = cursor.count > 0
        cursor.close()
        return userExists

    }

}