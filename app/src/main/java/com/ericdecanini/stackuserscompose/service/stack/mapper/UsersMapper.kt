package com.ericdecanini.stackuserscompose.service.stack.mapper

import com.ericdecanini.stackuserscompose.entity.User

interface UsersMapper {

    fun mapSingleUserListToUser(userList: List<User>): User?

}