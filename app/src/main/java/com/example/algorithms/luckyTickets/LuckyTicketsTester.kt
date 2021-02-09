package com.example.algorithms.luckyTickets

import com.example.algorithms.utils.ITask
import com.example.algorithms.utils.Tester

fun main() {
    val luckyTickets: ITask = LuckyTickets()
    val tester = Tester(luckyTickets, "\\luckyTickets")
    tester.runTest()
}