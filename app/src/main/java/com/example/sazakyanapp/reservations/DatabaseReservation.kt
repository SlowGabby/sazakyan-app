package com.example.sazakyanapp.reservations

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseReservation (context: Context) : SQLiteOpenHelper(context, "reservation.db", null, 1) {
    override fun onCreate (p0: SQLiteDatabase?) {
        p0?.execSQL("create table reservation (selectedCar TEXT primary key, PickUp DATE, DropOff DATE, PickUpLocation TEXT, DropOffLocation TEXT)")

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        p0?.execSQL("drop table if exists reservation")

    }

    fun insertReservationData(selectedCar: String, pickUp : String, dropOff : String, pickUpLocation : String, dropOffLocation : String): Boolean {

        val p0 = this.writableDatabase
        val cv = ContentValues()

        cv.put("selectedCar", selectedCar)
        cv.put("PickUp", pickUp)
        cv.put("DropOff", dropOff)
        cv.put("PickUpLocation", pickUpLocation)
        cv.put("DropOffLocation", dropOffLocation)

        val result = p0.insert("reservation", null, cv)

        if (result == -1.toLong()) {
            return false
        }

        return true

    }

    fun checkReservation(selectedCar: String) :Boolean {

        val p0 = this.writableDatabase
        val query = "select * from reservation where selectedCar='$selectedCar'"
        val cursor = p0.rawQuery(query, null)

        if (cursor.count <= 0) {

            cursor.close()
            return false
        }

        cursor.close()
        return true
    }


}