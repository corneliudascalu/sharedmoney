package com.corneliudascalu.sharedmoney

/**
 */
public open class Expense(id: Int, userId: String, amount: Double) {

    public val id: Int
    public val userId: String
    public val amount: Double

    init {
        this.id = id;
        this.userId = userId
        this.amount = amount
    }

}