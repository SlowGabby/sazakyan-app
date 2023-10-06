package com.example.sazakyanapp.sedan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sazakyanapp.R

class CarsAdapter (var mList : List<CarsData>) : RecyclerView.Adapter<CarsAdapter.CarsViewHolder>() {

    inner class CarsViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {

        val image : ImageView = itemView.findViewById(R.id.iv_images)
        val tvCars : TextView = itemView.findViewById(R.id.tv_cars)

    }

    fun setFilteredList(mList : List<CarsData>) {

        this.mList = mList
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarsViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.cars, parent, false)
        return CarsViewHolder(view)

    }

    override fun getItemCount(): Int {

        return mList.size

    }

    override fun onBindViewHolder(holder: CarsViewHolder, position: Int) {

        holder.image.setImageResource(mList[position].images)
        holder.tvCars.text = mList[position].title

    }
}

