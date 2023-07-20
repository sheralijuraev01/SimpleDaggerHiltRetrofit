package uz.sher.daggerhiltretrofit.repository

import uz.sher.daggerhiltretrofit.api.ApiService
import javax.inject.Inject

class UserRepository @Inject constructor(private val apiService: ApiService) {
    suspend fun getUsers() = apiService.getUsers()
}