package com.ericdecanini.stackuserscompose.service.stack

class StackApiServiceImpl(private val stackApi: StackApi): StackApiService {

    override suspend fun searchUsers(nameQuery: String, order: String)
            = stackApi.searchUsers(nameQuery, order)
}