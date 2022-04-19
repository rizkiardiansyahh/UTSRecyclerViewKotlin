package com.mobile.recyclerviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SepatuAdapter(private val context: Context, private val superhero: List<Sepatu>, val listener: (Sepatu) -> Unit)
    : RecyclerView.Adapter<SepatuAdapter.SepatuViewHolder>(){

    class SepatuViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgSepatu = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameSepatu= view.findViewById<TextView>(R.id.tv_item_name)
        val descSepatu = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(sepatu: Sepatu, listener: (Sepatu) -> Unit){
            imgSepatu.setImageResource(sepatu.imgSepatu)
            nameSepatu.text = sepatu.nameSepatu
            descSepatu.text = sepatu.descSepatu
            itemView.setOnClickListener{
                (listener(sepatu))
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SepatuViewHolder {
        return SepatuViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_sepatu, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SepatuViewHolder, position: Int) {
     holder.bindView(superhero[position], listener)
    }

    override fun getItemCount(): Int = superhero.size
    }


