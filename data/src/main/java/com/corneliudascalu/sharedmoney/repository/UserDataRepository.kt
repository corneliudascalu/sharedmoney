package com.corneliudascalu.sharedmoney.repository

import com.corneliudascalu.sharedmoney.User
import com.corneliudascalu.sharedmoney.UserEntityToUserMapper
import com.corneliudascalu.sharedmoney.UserRepository
import com.corneliudascalu.sharedmoney.datasource.UserDataSource

/**
 */
public class UserDataRepository(dataSource: UserDataSource) : UserRepository {

    private var dataSource: UserDataSource

    init {
        this.dataSource = dataSource
    }

    override fun getUser(userId: String): User {
        val userEntity = dataSource.getUserData(userId)
        return UserEntityToUserMapper().map(userEntity)
    }

    override fun putUser(user: User) {
        throw UnsupportedOperationException()
    }

    override fun getUsers(): List<User> {
        throw UnsupportedOperationException()
    }

    override fun deleteUser(userId: String): Int {
        throw UnsupportedOperationException()
    }

}