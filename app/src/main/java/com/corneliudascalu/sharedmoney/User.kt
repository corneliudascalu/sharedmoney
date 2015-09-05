package com.corneliudascalu.sharedmoney

/**
 */
public data class User(val firstName: String = "", val lastName: String = "")

public data class Loan(val userId: String, val receiverId: String, val value: Double)
