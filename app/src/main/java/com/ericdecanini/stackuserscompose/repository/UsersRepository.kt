package com.ericdecanini.stackuserscompose.repository

import com.ericdecanini.stackuserscompose.entity.User

interface UsersRepository {

    suspend fun searchUsers(nameQuery: String): List<User>

}