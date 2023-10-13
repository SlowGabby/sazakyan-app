package com.example.sazakyanapp.pangasinan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sazakyanapp.HomeActivity
import com.example.sazakyanapp.MainActivity
import com.example.sazakyanapp.R
import java.util.Locale

class PangasinanActivity : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView
    private lateinit var searchView : SearchView
    private var mList = ArrayList<PangasinanData>()
    private lateinit var adapter : PangasinanAdapter

    //    button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pangasinan)

        //  button

        findViewById<ImageView>(R.id.backBtn).setOnClickListener {

            startActivity(Intent(this@PangasinanActivity, HomeActivity::class.java))
            this@PangasinanActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )

        }


        //  recycler view

        recyclerView = findViewById(R.id.recyclerView)
        searchView = findViewById(R.id.searchView)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

        addDataToList()
        adapter = PangasinanAdapter(mList)
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

            val filteredList = ArrayList<PangasinanData>()

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

        mList.add(PangasinanData("Vios", R.drawable.toyotavios))
        mList.add(PangasinanData("Hiace", R.drawable.toyotahiace))
        mList.add(PangasinanData("Land Cruiser", R.drawable.toyota_landcruiser))
        mList.add(PangasinanData("Jazz", R.drawable.honda_jazz))

    }

}