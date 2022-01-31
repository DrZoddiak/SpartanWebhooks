package net.ecoporium.spartan.model.embed


import com.google.gson.annotations.SerializedName

data class Field(
    @SerializedName("inline")
    val `inline`: Boolean,
    @SerializedName("name")
    val name: String,
    @SerializedName("value")
    val value: String
)