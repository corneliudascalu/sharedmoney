package com.corneliudascalu.sharedmoney

/**
 */
public interface UserRepository {
    fun getUser(userId: String): User
    fun putUser(user: User): Unit
    fun getUsers(): List<User>
    fun deleteUser(userId: String): Int
}