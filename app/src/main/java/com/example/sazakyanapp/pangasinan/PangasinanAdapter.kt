package com.example.sazakyanapp.pangasinan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sazakyanapp.R


class PangasinanAdapter (var mList : List<PangasinanData>) : RecyclerView.Adapter<PangasinanAdapter.PangasinanViewHolder>() {

    inner class PangasinanViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {

        val image : ImageView = itemView.findViewById(R.id.iv_images)
        val tvCars : TextView = itemView.findViewById(R.id.tv_cars)

    }

    fun setFilteredList(mList : List<PangasinanData>) {

        this.mList = mList
        notifyDataSetChanged()

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PangasinanViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.cars, parent, false)
        return PangasinanViewHolder(view)

    }

    override fun getItemCount(): Int {

        return mList.size

    }

    override fun onBindViewHolder(holder: PangasinanViewHolder, position: Int) {

        holder.image.setImageResource(mList[position].images)
        holder.tvCars.text = mList[position].title

    }
}



