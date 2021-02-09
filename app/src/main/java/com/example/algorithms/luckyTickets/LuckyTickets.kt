package com.example.algorithms.luckyTickets

import com.example.algorithms.utils.ITask

class LuckyTickets : ITask {
    override fun run(data: List<String>): String {
        val number = data[0].toIntOrNull() ?: return ""
        return solveTask(number).toString()
    }

    private fun solveTask(amount: Int): Long {
        if (amount <= 0) return 0

        var startList = List(10) { 1 } + List(9) { 0 }

        repeat(amount - 1) {
            val tempList = mutableListOf<Int>()
            repeat(startList.size) {
                if (it < 10) {
                    tempList.add(startList.take(it + 1).sum())
                } else {
                    tempList.add(startList.subList(it - 9, it + 1).sum())
                }
            }
            startList = tempList + List(9) { 0 }
        }

        var sum = 0L
        startList.forEach { sum += it.toLong() * it.toLong() }
        return sum
    }
}