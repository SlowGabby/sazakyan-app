package com.example.sazakyanapp.makati

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sazakyanapp.R

class ManilaAdapter (var mList : List<ManilaData>) : RecyclerView.Adapter<ManilaAdapter.ManilaViewHolder>() {

    inner class ManilaViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {

        val image : ImageView = itemView.findViewById(R.id.iv_images)
        val tvCars : TextView = itemView.findViewById(R.id.tv_cars)

    }

    fun setFilteredList(mList : List<ManilaData>) {

        this.mList = mList
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ManilaViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.makati, parent, false)
        return ManilaViewHolder(view)

    }

    override fun getItemCount(): Int {

        return mList.size

    }

    override fun onBindViewHolder(holder: ManilaViewHolder, position: Int) {

        holder.image.setImageResource(mList[position].vanImages)
        holder.tvCars.text = mList[position].vanTitle

    }
}

