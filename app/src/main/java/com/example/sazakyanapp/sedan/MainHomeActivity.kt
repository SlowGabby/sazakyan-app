package com.example.sazakyanapp.sedan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sazakyanapp.R
import java.util.Locale

class MainHomeActivity : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView
    private lateinit var searchView : SearchView
    private var mList = ArrayList<CarsData>()
    private lateinit var adapter : CarsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_home)

        recyclerView = findViewById(R.id.recyclerView)
        searchView = findViewById(R.id.searchView)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

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

    }
}