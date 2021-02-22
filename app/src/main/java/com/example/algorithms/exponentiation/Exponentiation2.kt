package com.example.algorithms.exponentiation

import com.example.algorithms.utils.ITask
import kotlin.math.round

class Exponentiation2 : ITask {
    override fun run(data: List<String>): String {
        val number = data[0].toDoubleOrNull() ?: return "error"
        val power = data[1].toIntOrNull() ?: return "error"

        if (power == 0) return "1.0"

        val result = pow(number, power)

        return (round(result * 100000000000) / 100000000000.0).toString()
    }

    private fun pow(a: Double, n: Int): Double {
        var powValue = 1
        var result = a
        while (powValue * 2 < n) {
            result *= result
            powValue *= 2
        }
        repeat(n - powValue) {
            result *= a
        }
        return result
    }
}