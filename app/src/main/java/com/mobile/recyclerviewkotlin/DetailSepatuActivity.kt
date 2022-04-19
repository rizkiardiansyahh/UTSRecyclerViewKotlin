package com.mobile.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailSepatuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_sepatu)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val sepatu = intent.getParcelableExtra<Sepatu>(MainActivity.INTENT_PARCELABLE)

        val imgSepatu = findViewById<ImageView>(R.id.img_item_photo)
        val nameSepatu = findViewById<TextView>(R.id.tv_item_name)
        val descSepatu = findViewById<TextView>(R.id.tv_item_description)

        imgSepatu.setImageResource(sepatu?.imgSepatu!!)
        nameSepatu.text = sepatu.nameSepatu
        descSepatu.text = sepatu.descSepatu
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}