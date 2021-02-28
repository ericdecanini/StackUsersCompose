package com.ericdecanini.stackuserscompose.service.stack.adapter

import com.ericdecanini.stackuserscompose.entity.User
import com.ericdecanini.stackuserscompose.service.stack.model.UserDataModel
import com.ericdecanini.stackuserscompose.service.stack.model.UsersDataModel
import com.ericdecanini.stackuserscompose.service.stack.model.WrappedUserList
import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson

class UsersJsonAdapter {

    @WrappedUserList
    @FromJson
    fun fromJson(json: UsersDataModel) = json.items.map { it.mapToUser() }

    @ToJson
    fun toJson(@WrappedUserList value: List<User>): UsersDataModel {
        throw UnsupportedOperationException()
    }

    private fun UserDataModel.mapToUser() = User(
        id,
        name,
        imageUrl,
        link,
        reputation,
        location,
        creationDate
    )
}