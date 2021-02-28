package com.ericdecanini.stackuserscompose.service.stack.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonQualifier

@Retention(AnnotationRetention.RUNTIME)
@JsonQualifier
annotation class WrappedUserList

data class UsersDataModel(val items: List<UserDataModel>)

data class UserDataModel(
    @Json(name = "user_id")
    val id: Int,
    @Json(name = "display_name")
    val name: String,
    @Json(name = "profile_image")
    val imageUrl: String,
    val link: String,
    val reputation: Int,
    val location: String?,
    @Json(name = "creation_date")
    val creationDate: Long
)