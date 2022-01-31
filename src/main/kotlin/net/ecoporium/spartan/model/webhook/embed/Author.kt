package net.ecoporium.spartan.model.webhook.embed


import com.google.gson.annotations.SerializedName

data class Author(
    @SerializedName("icon_url")
    val iconUrl: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)