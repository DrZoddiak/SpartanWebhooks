package net.ecoporium.spartan.model


import com.google.gson.annotations.SerializedName
import net.ecoporium.spartan.model.embed.Embed

data class Webhook(
    @SerializedName("content")
    val content: String,
    @SerializedName("embed")
    val embed: Embed
)