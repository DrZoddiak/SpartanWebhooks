package net.ecoporium.spartan.model.webhook.embed


import com.google.gson.annotations.SerializedName

data class Field(
    @SerializedName("inline")
    val `inline`: Boolean,
    @SerializedName("name")
    val name: String,
    @SerializedName("value")
    val value: String
)