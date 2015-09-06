package com.corneliudascalu.sharedmoney.datasource

import com.corneliudascalu.sharedmoney.entity.UserEntity

/**
 */
public interface UserDataSource {
    fun getUserData(userId: String): UserEntity
    fun putUserData(userData: UserEntity)
    fun deleteUser(userId: String): Int
}