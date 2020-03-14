package com.zuhaibahmad.kotestrobolectricconfig

import io.kotest.matchers.shouldBe
import kotlinx.android.synthetic.main.activity_main.*
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class MainRoboTest {
    @Test
    fun `When main activity is started, should display correct app name`() {
        val activity = Robolectric.buildActivity(MainActivity::class.java).setup().resume()
        val name = activity.get().tvAppName.text.toString()
        name.shouldBe("KotestApp")
    }
}
