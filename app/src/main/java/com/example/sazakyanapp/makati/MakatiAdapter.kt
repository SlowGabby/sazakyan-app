package com.example.sazakyanapp.makati

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sazakyanapp.R

class MakatiAdapter (var mList : List<MakatiData>) : RecyclerView.Adapter<MakatiAdapter.MakatiViewHolder>() {

    inner class MakatiViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {

        val image : ImageView = itemView.findViewById(R.id.iv_images)
        val tvCars : TextView = itemView.findViewById(R.id.tv_cars)

    }

    fun setFilteredList(mList : List<MakatiData>) {

        this.mList = mList
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MakatiViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.makati, parent, false)
        return MakatiViewHolder(view)

    }

    override fun getItemCount(): Int {

        return mList.size

    }

    override fun onBindViewHolder(holder: MakatiViewHolder, position: Int) {

        holder.image.setImageResource(mList[position].vanImages)
        holder.tvCars.text = mList[position].vanTitle

    }
}

