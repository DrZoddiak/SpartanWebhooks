package net.ecoporium.spartan.model.embed


import com.google.gson.annotations.SerializedName

data class Footer(
    @SerializedName("icon_url")
    val iconUrl: String,
    @SerializedName("text")
    val text: String
)