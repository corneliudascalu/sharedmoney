package com.corneliudascalu.sharedmoney

/**
 */
public open class Expense(userId:String, amount:Double) {

    public val userId:String?
    public val amount:Double?

    init {
        this.userId = userId
        this.amount = amount
    }

}