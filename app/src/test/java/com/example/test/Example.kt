package com.example.test

import org.junit.Assert.*
import org.junit.Test


class Example {
    @Test
    fun test_one(){
        val one = 5
        val two = 4
        val assert_test = 9
        val log_fun = sum(one,two)
        assertEquals(assert_test,log_fun)
    }
    @Test
    fun test_two(){
        val one = 4
        val two = 4
        val assert_test = 8
        val log_fun = sum(one,two)
        assertEquals(assert_test,log_fun)
    }
    @Test
    fun test_tree(){
        assertTrue(Testing.Trust(true))
    }
}