package com.ericdecanini.stackuserscompose.service.stack.mapper

import android.util.Log
import com.ericdecanini.stackuserscompose.entity.User

class UsersMapperImpl : UsersMapper {

    override fun mapSingleUserListToUser(userList: List<User>): User? {
        if (userList.size > 1)
            Log.w(TAG, "Unexpected Behaviour: more than one user found while mapping single user")
        return userList.firstOrNull()
    }

    companion object {
        private val TAG = UsersMapperImpl::class.java.simpleName
    }
}