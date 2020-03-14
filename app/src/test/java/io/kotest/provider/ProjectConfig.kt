package io.kotest.provider

import io.kotest.core.config.AbstractProjectConfig
import io.kotest.experimental.robolectric.RobolectricExtension

/**
 * Project configurations for Kotest, used to provide Robolectric support (and other extensions)
 */
object ProjectConfig : AbstractProjectConfig() {

    override fun extensions() = listOf(RobolectricExtension())

    private var started: Long = 0

    override fun beforeAll() {
        started = System.currentTimeMillis()
    }

    override fun afterAll() {
        val time = System.currentTimeMillis() - started
        println("[ProjectConfig] overall time [ms]: $time")
    }
}