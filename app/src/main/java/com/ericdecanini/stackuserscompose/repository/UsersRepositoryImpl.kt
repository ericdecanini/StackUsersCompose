package com.ericdecanini.stackuserscompose.repository

import com.ericdecanini.stackuserscompose.service.stack.StackApiService

class UsersRepositoryImpl(
    private val stackApiService: StackApiService
) : UsersRepository {

    override suspend fun searchUsers(nameQuery: String)
            = stackApiService.searchUsers(nameQuery, ASCENDING)

    companion object {
        private const val ASCENDING = "asc"
    }
}