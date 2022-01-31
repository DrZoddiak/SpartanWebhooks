package net.ecoporium.spartan.model.embed


import com.google.gson.annotations.SerializedName

data class Thumbnail(
    @SerializedName("url")
    val url: String
)