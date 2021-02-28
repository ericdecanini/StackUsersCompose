package com.ericdecanini.stackuserscompose.service.stack

import com.ericdecanini.stackuserscompose.entity.User
import com.ericdecanini.stackuserscompose.service.stack.model.WrappedUserList
import retrofit2.http.GET
import retrofit2.http.Query

interface StackApi {

    @GET("/users?sort=name&site=stackoverflow")
    @WrappedUserList
    suspend fun searchUsers(
        @Query("inname") nameQuery: String,
        @Query("order") order: String
    ): List<User>

}