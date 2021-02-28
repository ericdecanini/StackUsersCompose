package com.ericdecanini.stackuserscompose.entity

data class User(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val link: String,
    val reputation: Int,
    val location: String?,
    val creationDate: Long
)