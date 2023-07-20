package uz.sher.daggerhiltretrofit.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import uz.sher.daggerhiltretrofit.model.User
import uz.sher.daggerhiltretrofit.repository.UserRepository
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(private val userRepository: UserRepository) : ViewModel() {

    private val _userData:MutableLiveData<List<User>> = MutableLiveData()
    val userData get() = _userData

    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch {
            _userData.value=userRepository.getUsers()
        }
    }

}