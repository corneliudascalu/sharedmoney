package com.corneliudascalu.sharedmoney

import java.util.*

/**
 */
public class Group(id: Int) {
    public val id: Int
    public val people: MutableList<User>
    public val expenses: MutableList<Expense>
    public val loans: MutableList<Expense>

    init {
        this.id = id
        people = ArrayList()
        expenses = ArrayList()
        loans = ArrayList()
    }

    fun addExpense(expense: Expense): Unit {
        expenses.add(expense)
    }
}