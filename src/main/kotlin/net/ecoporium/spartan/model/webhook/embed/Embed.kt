package net.ecoporium.spartan.model.webhook.embed


import com.google.gson.annotations.SerializedName

data class Embed(
    @SerializedName("author")
    val author: Author,
    @SerializedName("color")
    val color: Int,
    @SerializedName("description")
    val description: String,
    @SerializedName("fields")
    val fields: List<Field>,
    @SerializedName("footer")
    val footer: Footer,
    @SerializedName("image")
    val image: Image,
    @SerializedName("thumbnail")
    val thumbnail: Thumbnail,
    @SerializedName("timestamp")
    val timestamp: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("url")
    val url: String
)