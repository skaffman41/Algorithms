package com.example.algorithms.fibonachi

import com.example.algorithms.utils.ITask
import java.math.BigDecimal
import kotlin.math.pow
import kotlin.math.sqrt

class Fibonachi3 : ITask {
    override fun run(data: List<String>): String {
        val number = data[0].toIntOrNull() ?: 0
        val result = getFibonachi(number)
        return result.toString()
    }

    private fun getFibonachi(number: Int): BigDecimal {
        val fi: Double = (1 + sqrt(5.0)) / 2

        val fiPow = fi.pow(number)

        val d5 = fiPow / sqrt(5.0)

        return BigDecimal((fi.pow(number) / sqrt(5.0) + 0.5).toLong())
    }
}