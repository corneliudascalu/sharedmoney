package com.corneliudascalu.sharedmoney

import com.corneliudascalu.sharedmoney.entity.UserEntity

/**
 */
public class UserEntityToUserMapper {
    fun map(userEntity: UserEntity): User {

        return User(userEntity.id, userEntity.firstName, userEntity.lastName)
    }
}