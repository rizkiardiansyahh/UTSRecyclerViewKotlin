package com.mobile.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Sepatu(
    val imgSepatu: Int,
    val nameSepatu: String,
    val descSepatu:  String
) : Parcelable
