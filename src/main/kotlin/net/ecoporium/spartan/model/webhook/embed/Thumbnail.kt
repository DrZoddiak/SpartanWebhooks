package net.ecoporium.spartan.model.webhook.embed


import com.google.gson.annotations.SerializedName

data class Thumbnail(
    @SerializedName("url")
    val url: String
)