package com.woowahan.thdeng.test.jacoco

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class KotlinFooTest {

    private val kotlinFoo = KotlinFoo()

    @Test
    fun `partially covered hello method test`() {
        val actual = kotlinFoo.hello("펭")
        assertEquals(actual, "하")
    }

}
