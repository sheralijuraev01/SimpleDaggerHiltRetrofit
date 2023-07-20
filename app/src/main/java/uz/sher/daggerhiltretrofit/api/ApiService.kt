package uz.sher.daggerhiltretrofit.api

import retrofit2.http.GET
import uz.sher.daggerhiltretrofit.model.User

interface ApiService {
    @GET("users")
   suspend fun getUsers(): List<User>
}