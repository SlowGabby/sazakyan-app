package com.example.sazakyanapp.suv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sazakyanapp.R
import com.example.sazakyanapp.suv.SuvData

class SuvAdapter (var mList : List<SuvData>) : RecyclerView.Adapter<SuvAdapter.SuvViewHolder>() {

    inner class SuvViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {

        val suvImage : ImageView = itemView.findViewById(R.id.iv_images)
        val tvSuv : TextView = itemView.findViewById(R.id.tv_cars)

    }

    fun setFilteredList(mList : List<SuvData>) {

        this.mList = mList
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuvViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.cars, parent, false)
        return SuvViewHolder(view)

    }

    override fun getItemCount(): Int {

        return mList.size

    }

    override fun onBindViewHolder(holder: SuvViewHolder, position: Int) {

        holder.suvImage.setImageResource(mList[position].suvImages)
        holder.tvSuv.text = mList[position].suvTitle

    }
}

