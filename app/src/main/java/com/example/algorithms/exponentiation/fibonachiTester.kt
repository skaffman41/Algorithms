package com.example.algorithms.exponentiation

import com.example.algorithms.utils.ITask
import com.example.algorithms.utils.Tester

fun main() {
    val exponentiation1: ITask = Exponentiation1()
    val exponentiation2: ITask = Exponentiation2()
    val exponentiation3: ITask = Exponentiation3()
    val tester = Tester(exponentiation3, "\\exponentiation")
    tester.runTest()
}