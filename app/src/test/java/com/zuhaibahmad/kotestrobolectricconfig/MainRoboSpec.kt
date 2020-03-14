package com.zuhaibahmad.kotestrobolectricconfig

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.experimental.robolectric.RobolectricTest
import io.kotest.matchers.shouldBe
import kotlinx.android.synthetic.main.activity_main.*
import org.robolectric.Robolectric.buildActivity

@RobolectricTest
class MainRoboSpec : BehaviorSpec({

    Given("main activity is started") {
        val activity = buildActivity(MainActivity::class.java).setup().resume()

        When("app name is displayed") {
            val name = activity.get().tvAppName.text.toString()

            Then("name should be correct") {
                name.shouldBe("KotestApp")
            }
        }
    }
})