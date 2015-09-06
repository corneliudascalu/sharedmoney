package com.corneliudascalu.sharedmoney

/**
 */
public class Loan(userId: String, receiverUserId:String, amount: Double) : Expense(userId, amount) {
    public var receiverUserId:String?

    init {
        this.receiverUserId = receiverUserId
    }

    public override fun toString(): String {
        return "Loan($userId, $receiverUserId, $amount)"
    }
}