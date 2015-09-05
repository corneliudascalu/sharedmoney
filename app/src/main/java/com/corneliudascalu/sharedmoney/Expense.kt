package com.corneliudascalu.sharedmoney

/**
 */
public class Expense {
    val loan: Loan = Loan("asd", "asd", 23.6)

    public fun Expense(){

    }

    public override fun toString(): String {
        return loan.toString()
    }
}