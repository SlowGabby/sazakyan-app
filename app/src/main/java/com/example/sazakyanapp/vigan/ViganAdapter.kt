package com.example.sazakyanapp.vigan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sazakyanapp.R

class ViganAdapter (var mList : List<ViganData>) : RecyclerView.Adapter<ViganAdapter.ViganViewHolder>() {

    inner class ViganViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {

        val suvImage : ImageView = itemView.findViewById(R.id.iv_images)
        val tvSuv : TextView = itemView.findViewById(R.id.tv_cars)

    }

    fun setFilteredList(mList : List<ViganData>) {

        this.mList = mList
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViganViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.cars, parent, false)
        return ViganViewHolder(view)

    }

    override fun getItemCount(): Int {

        return mList.size

    }

    override fun onBindViewHolder(holder: ViganViewHolder, position: Int) {

        holder.suvImage.setImageResource(mList[position].suvImages)
        holder.tvSuv.text = mList[position].suvTitle

    }
}