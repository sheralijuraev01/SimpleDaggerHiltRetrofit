package uz.sher.daggerhiltretrofit.model


import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("body")
    val body: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("userId")
    val userId: Int?
)