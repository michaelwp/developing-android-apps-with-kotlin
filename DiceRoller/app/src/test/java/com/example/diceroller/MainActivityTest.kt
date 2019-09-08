package com.example.diceroller

import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.*

class MainActivityTest {

    @Test
    fun getDiceImage() {
        val randomInt = Random().nextInt(6) + 1
        val x: Boolean = (randomInt > 0) && (randomInt < 7)
        assertEquals( true, x)
    }
}