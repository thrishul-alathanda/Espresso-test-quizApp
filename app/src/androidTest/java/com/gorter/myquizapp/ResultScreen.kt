package com.gorter.myquizapp

import androidx.test.espresso.Espresso
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.assertion.ViewAssertions.matches

@RunWith(AndroidJUnit4::class)

class ResultScreen {
    @get:Rule
    val activityRule = ActivityScenarioRule(ResultActivity::class.java)
    @Test
    fun titleIsShown() {
        Espresso.onView(withText("Result"))
            .check(matches(isDisplayed()))
    }
}