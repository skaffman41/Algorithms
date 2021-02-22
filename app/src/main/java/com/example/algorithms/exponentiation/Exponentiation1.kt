package com.example.algorithms.exponentiation

import com.example.algorithms.utils.ITask
import kotlin.math.round

class Exponentiation1 : ITask {
    override fun run(data: List<String>): String {
        val number = data[0].toDoubleOrNull() ?: return "error"
        val power = data[1].toIntOrNull() ?: return "error"

        if (power == 0) return "1.0"

        var result = number

        repeat(power - 1) {
            result *= number
        }

        return (round(result * 100000000000) / 100000000000.0).toString()
    }
}