package com.ericdecanini.stackuserscompose.service.stack

import com.ericdecanini.stackuserscompose.entity.User

interface StackApiService {

    suspend fun searchUsers(nameQuery: String, order: String): List<User>

}