package com.example.sazakyanapp.sedan

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sazakyanapp.DescriptionActivity
import com.example.sazakyanapp.MainActivity
import com.example.sazakyanapp.R
import java.util.Locale

class MainHomeActivity : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView
    private lateinit var searchView : SearchView
    private var mList = ArrayList<CarsData>()
    private lateinit var adapter : CarsAdapter

    //    button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_home)

        //  button

        findViewById<ImageView>(R.id.backBtn).setOnClickListener {

            startActivity(Intent(this@MainHomeActivity, MainActivity::class.java))
//            this@MainHomeActivity.overridePendingTransition(
//                R.anim.animate_slide_in_left,
//                R.anim.animate_slide_out_right
//            )
        }


        //  recycler view

        recyclerView = findViewById(R.id.recyclerView)
        searchView = findViewById(R.id.searchView)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

        addDataToList()
        adapter = CarsAdapter(mList)
        recyclerView.adapter = adapter

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {

            override fun onQueryTextSubmit(query: String?): Boolean {

                return false

            }

            override fun onQueryTextChange(newText: String?): Boolean {

                filterList(newText)
                return true

            }


        })

    }


    private fun filterList (query : String?) {

        if (query != null) {

            val filteredList = ArrayList<CarsData>()

            for (i in mList) {

                if (i.title.lowercase(Locale.ROOT).contains(query)) {
                    filteredList.add(i)

                }
            }

            if (filteredList.isEmpty()) {

                Toast.makeText(this, "No Data found", Toast.LENGTH_SHORT).show()

            } else {

                adapter.setFilteredList(filteredList)

            }

        }

    }

    private fun addDataToList() {

        mList.add(CarsData("Vios", R.drawable.toyotavios))
        mList.add(CarsData("Hiace", R.drawable.toyotahiace))
        mList.add(CarsData("Land Cruiser", R.drawable.toyota_landcruiser))
        mList.add(CarsData("Jazz", R.drawable.honda_jazz))

    }

}