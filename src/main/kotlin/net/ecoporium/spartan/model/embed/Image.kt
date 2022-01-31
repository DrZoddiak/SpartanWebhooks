package net.ecoporium.spartan.model.embed


import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("url")
    val url: String
)