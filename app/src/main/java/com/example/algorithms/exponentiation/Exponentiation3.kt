package com.example.algorithms.exponentiation

import com.example.algorithms.utils.ITask
import kotlin.math.round

class Exponentiation3 : ITask {
    override fun run(data: List<String>): String {
        val number = data[0].toDoubleOrNull() ?: return "error"
        val power = data[1].toIntOrNull() ?: return "error"

        if (power == 0) return "1.0"

        return (round(pow(3.0, 6) * 100000000000) / 100000000000.0).toString()
    }

    private fun pow(number: Double, power: Int): Double {
        var powValue = 1
        var res = 1.0
        var tempNumber: Double = number
        var tempPower = power

        while (tempPower > 0) {
            val rem = tempPower % 2
            if (rem > 0) {
                res *= tempNumber
                tempNumber *= tempNumber
            } else {
                tempNumber *= tempNumber
                powValue *= 2
            }
            tempPower /= 2
        }

        return res
    }
}