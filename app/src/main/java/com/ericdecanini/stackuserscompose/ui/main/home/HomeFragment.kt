package com.ericdecanini.stackuserscompose.ui.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.platform.ComposeView
import androidx.lifecycle.ViewModelProvider
import com.ericdecanini.stackuserscompose.entity.User
import com.ericdecanini.stackuserscompose.ui.theme.StackUsersComposeTheme
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class HomeFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel by lazy {
        ViewModelProvider(this, viewModelFactory).get(HomeViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent { HomeScreen() }
        }
    }

    @Composable
    fun HomeScreen() {
        StackUsersComposeTheme {
            Surface(color = MaterialTheme.colors.background) {
                val users: List<User> by viewModel.usersLiveData.observeAsState(listOf())
                UsersList(users)
            }
        }
    }

    @Composable
    fun UsersList(users: List<User>) {
        Column {
            users.forEach { user ->
                UserRow(user)
            }
        }
    }

    @Composable
    fun UserRow(user: User) {
        Text(user.name)
    }

}