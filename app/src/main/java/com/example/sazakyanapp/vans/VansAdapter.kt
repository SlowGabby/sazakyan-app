package com.example.sazakyanapp.vans

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sazakyanapp.R

class VansAdapter (var mList : List<VansData>) : RecyclerView.Adapter<VansAdapter.VansViewHolder>() {

    inner class VansViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {

        val image : ImageView = itemView.findViewById(R.id.iv_images)
        val tvCars : TextView = itemView.findViewById(R.id.tv_cars)

    }

    fun setFilteredList(mList : List<VansData>) {

        this.mList = mList
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VansViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.vans, parent, false)
        return VansViewHolder(view)

    }

    override fun getItemCount(): Int {

        return mList.size

    }

    override fun onBindViewHolder(holder: VansViewHolder, position: Int) {

        holder.image.setImageResource(mList[position].vanImages)
        holder.tvCars.text = mList[position].vanTitle

    }
}

