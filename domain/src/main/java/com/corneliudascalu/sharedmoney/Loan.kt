package com.corneliudascalu.sharedmoney

/**
 */
public class Loan(id: Int, userId: String, receiverUserId: String, amount: Double) : Expense(id, userId, amount) {
    public var receiverUserId: String

    init {
        this.receiverUserId = receiverUserId
    }

    public override fun toString(): String {
        return "Loan($userId, $receiverUserId, $amount)"
    }
}