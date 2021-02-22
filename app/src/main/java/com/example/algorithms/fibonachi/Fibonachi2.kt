package com.example.algorithms.fibonachi

import com.example.algorithms.utils.ITask
import java.math.BigDecimal

class Fibonachi2 : ITask {
    override fun run(data: List<String>): String {
        val number = data[0].toIntOrNull() ?: 0
        val result = getFibonachi(number)
        return result.toString()
    }

    private fun getFibonachi(number: Int): BigDecimal {
        var f0 = BigDecimal(0L)
        var f1 = BigDecimal(1L)
        var f2 = BigDecimal(1L)

        return when (number) {
            0 -> f0
            1 -> f1
            else -> {
                repeat(number - 1) {
                    f2 = f0 + f1
                    f0 = f1
                    f1 = f2
                }
                f2
            }
        }
    }
}