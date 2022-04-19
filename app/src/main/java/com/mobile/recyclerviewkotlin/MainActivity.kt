package com.mobile.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val sepatuList = listOf<Sepatu>(
            Sepatu(
                R.drawable.sepatu1,
                "Clr900",
                "Sepatu Futsal CLR 900 Black_Grenn"
            ),
            Sepatu(
                R.drawable.sepatu2,
                "Lining",
                "Sepatu Badminton Lining White_Red"
            ),
            Sepatu(
                R.drawable.sepatu3,
                "Mizuno",
                "Sepatu Volly Black_Blue"
            ),
            Sepatu(
                R.drawable.sepatu4,
                "Mizuno",
                "Sepatu Volly White_Blue"
            ),
            Sepatu(
                R.drawable.sepatu5,
                "Mizuno",
                "Sepatu Mizuno Orange_White"
            ),
            Sepatu(
                R.drawable.sepatu6,
                "Nike",
                "Sepatu Futsal Nike Tempo Grenn_Yellow"
            ),
            Sepatu(
                R.drawable.sepatu7,
                "Ortuseight",
                "Sepatu Bola Ortuseight Orange_Yellow"
            ),
            Sepatu(
                R.drawable.sepatu8,
                "Vans",
                "Sepatu Sneakers Vans "
            ),
            Sepatu(
                R.drawable.sepatu9,
                "Specs",
                "Sepatu Bola Specs Black"
            ),
            Sepatu(
                R.drawable.sepatu10,
                "Yonex",
                "Sepatu Badminton Yonex White_Black"

            )
            )


        val recyclerView = findViewById<RecyclerView>(R.id.rv_sepatu)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SepatuAdapter(this, sepatuList){

            val intent = Intent (this, DetailSepatuActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}