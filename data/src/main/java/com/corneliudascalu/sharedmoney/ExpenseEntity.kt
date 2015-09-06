package com.corneliudascalu.sharedmoney

/**
 */
public data class ExpenseEntity(id: String, ownerId: String, amount: Double)

public data class LoanEntity(id: String, ownerId: String, receiverId: String, amount: Double)