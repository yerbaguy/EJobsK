package com.ebartmedia.ejobsk6.model



import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

//@Parcelize
//data class Movie(val name: String? = null,
//                 val resource: Int? = null):Parcelable


@Parcelize
data class Categories(

    @SerializedName("id") val id:Int?=0,
    @SerializedName("catName") val catName:String?=null,
    @SerializedName("subCatName") val subCatName:String?=null):Parcelable