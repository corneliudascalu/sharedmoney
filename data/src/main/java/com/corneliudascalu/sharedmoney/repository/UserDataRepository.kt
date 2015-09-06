package com.corneliudascalu.sharedmoney.repository

import com.corneliudascalu.sharedmoney.entity.UserEntity

/**
 */
public interface UserDataRepository {
    fun getUserData(userId: String): UserEntity
    fun storeUserData(userEntity: UserEntity): Unit
    fun getUsers(): List<UserEntity>
}