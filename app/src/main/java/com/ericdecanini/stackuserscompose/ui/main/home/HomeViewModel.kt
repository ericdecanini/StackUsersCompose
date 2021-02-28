package com.ericdecanini.stackuserscompose.ui.main.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ericdecanini.stackuserscompose.entity.User
import com.ericdecanini.stackuserscompose.repository.UsersRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val usersRepository: UsersRepository
) : ViewModel() {

    private val _usersLiveData = MutableLiveData<List<User>>()

    private val _name = MutableLiveData("")
    val name: LiveData<String> = _name
    val usersLiveData: LiveData<List<User>> = _usersLiveData

    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch {
            val searchResults = usersRepository.searchUsers("tim")
            _usersLiveData.postValue(searchResults)
        }
    }

}