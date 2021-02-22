package com.example.algorithms.fibonachi

import com.example.algorithms.utils.ITask
import java.math.BigDecimal

class Fibonachi4 : ITask {
    override fun run(data: List<String>): String {
        val number = data[0].toIntOrNull() ?: 0
        val result = getFibonachi(number)
        return result.toString()
    }

    private fun getFibonachi(number: Int): BigDecimal {
        val resultMatrix = matrixPow(number)
        return resultMatrix[0][0]
    }

    private fun matrixPow(power: Int): Array<Array<BigDecimal>> {
        var powValue = 1
        var res =
            arrayOf(arrayOf(BigDecimal(1L), BigDecimal(1)), arrayOf(BigDecimal(1), BigDecimal(0)))
        var tempMatrix =
            arrayOf(arrayOf(BigDecimal(1L), BigDecimal(1)), arrayOf(BigDecimal(1), BigDecimal(0)))
        var tempPower = power - 2

        while (tempPower > 0) {
            val rem = tempPower % 2
            if (rem > 0) {
                res = arrayOf(
                    arrayOf(
                        res[0][0] * tempMatrix[0][0] + res[0][1] * tempMatrix[1][0],
                        res[0][0] * tempMatrix[0][1] + res[0][1] * tempMatrix[1][1]
                    ), arrayOf(
                        res[1][0] * tempMatrix[0][0] + res[1][1] * tempMatrix[1][0],
                        res[1][0] * tempMatrix[0][1] + res[1][1] * tempMatrix[1][1]
                    )
                )
                tempMatrix = arrayOf(
                    arrayOf(
                        tempMatrix[0][0] * tempMatrix[0][0] + tempMatrix[0][1] * tempMatrix[1][0],
                        tempMatrix[0][0] * tempMatrix[0][1] + tempMatrix[0][1] * tempMatrix[1][1]
                    ), arrayOf(
                        tempMatrix[1][0] * tempMatrix[0][0] + tempMatrix[1][1] * tempMatrix[1][0],
                        tempMatrix[1][0] * tempMatrix[0][1] + tempMatrix[1][1] * tempMatrix[1][1]
                    )
                )
            } else {
                tempMatrix = arrayOf(
                    arrayOf(
                        tempMatrix[0][0] * tempMatrix[0][0] + tempMatrix[0][1] * tempMatrix[1][0],
                        tempMatrix[0][0] * tempMatrix[0][1] + tempMatrix[0][1] * tempMatrix[1][1]
                    ), arrayOf(
                        tempMatrix[1][0] * tempMatrix[0][0] + tempMatrix[1][1] * tempMatrix[1][0],
                        tempMatrix[1][0] * tempMatrix[0][1] + tempMatrix[1][1] * tempMatrix[1][1]
                    )
                )
                powValue *= 2
            }
            tempPower /= 2
        }

        return res
    }
}