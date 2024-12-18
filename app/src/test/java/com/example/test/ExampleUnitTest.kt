package com.example.test

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun test(){

    }
    @Test
    fun Test_1() {
        val a = 1
        val b = 1
        val c = 2
        val test = sum(a,b)
        assertEquals(c, test)
    }
    @Test
    fun Test_2() {
        assertTrue(Testing.Trust(true))
    }
}