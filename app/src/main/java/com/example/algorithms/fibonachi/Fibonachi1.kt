package com.example.algorithms.fibonachi

import com.example.algorithms.utils.ITask
import java.math.BigDecimal

class Fibonachi1 : ITask {
    override fun run(data: List<String>): String {
        val number = data[0].toIntOrNull() ?: 0
        val result = getFibonachi(number)
        return result.toString()
    }

    private fun getFibonachi(number: Int): BigDecimal {
        return if (number <= 1) {
            BigDecimal(number)
        } else {
            getFibonachi(number - 1) + getFibonachi(number - 2)
        }
    }
}