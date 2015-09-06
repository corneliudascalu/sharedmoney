package com.corneliudascalu.sharedmoney.datasource

import com.corneliudascalu.sharedmoney.entity.UserEntity
import com.parse.ParseObject

/**
 */
public class ParseUserDataSource : UserDataSource{

    override fun getUserData(userId: String): UserEntity {
        val parseObject = ParseObject.create("UserData")
        return (parseObject.fetchIfNeeded() as UserEntity);

    }

    override fun putUserData(userData: UserEntity) {
        throw UnsupportedOperationException()
    }

    override fun deleteUser(userId: String): Int {
        throw UnsupportedOperationException()
    }
}