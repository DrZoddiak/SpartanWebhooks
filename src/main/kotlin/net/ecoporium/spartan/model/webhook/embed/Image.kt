package net.ecoporium.spartan.model.webhook.embed


import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("url")
    val url: String
)