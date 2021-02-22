package com.example.algorithms.utils

import java.io.File
import java.util.*

class Tester(private val task: ITask, private val path: String) {

    fun runTest() {
        var counter = 0
        while (true) {
            val inFile =
                ".\\app\\src\\main\\java\\com\\example\\algorithms$path\\samples\\test.$counter.in"
            val outFile =
                ".\\app\\src\\main\\java\\com\\example\\algorithms$path\\samples\\test.$counter.out"
            if (!File(inFile).exists() || !File(outFile).exists()) break
            println("Test $counter - ${runTest(inFile, outFile)}")
            println("------------------------")
            counter++
        }
    }

    private fun runTest(inFile: String, outFile: String): Boolean {
        val startTime = Date().time
        val data = File(inFile).readLines()
        val expect = File(outFile).readText().trim()
        println("expect = $expect")
        val actual = task.run(data)
        println("actual = $actual")
        println("time = ${Date().time - startTime}")
        return actual == expect
    }

}