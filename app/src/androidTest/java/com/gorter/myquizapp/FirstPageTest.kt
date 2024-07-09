package com.gorter.myquizapp

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.util.regex.Pattern.matches
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule


@RunWith(AndroidJUnit4::class)

class Test {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun titleIsShown() {
        onView(withText("Quiz App!")).check(matches(isDisplayed()))
    }

    @Test
    fun canEnterName() {
        onView(withId(R.id.et_name)).perform(typeText("Thrishul"))
        closeSoftKeyboard()
        onView(withId(R.id.btn_start)).perform(click())
       // onView(withId(R.id.tv_question)).check(matches(isDisplayed()))
    }

    @Test
    fun canViewQuestions() {
        onView(withId(R.id.et_name)).perform(typeText("Thrishul"))
        closeSoftKeyboard()
        onView(withId(R.id.btn_start)).perform(click())
        onView(withText("What country does this flag belong to?")).check(matches(isDisplayed()))
        onView(withId(R.id.tv_question)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_option_one)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_option_two)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_option_three)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_option_four)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_submit)).check(matches(isDisplayed()))
        onView(withId(R.id.progress_bar)).check(matches(isDisplayed()))
    }
    @Test
    fun canSubmitAnswersQ1() {
        onView(withId(R.id.et_name)).perform(typeText("Thrishul"))
        closeSoftKeyboard()
        onView(withId(R.id.btn_start)).perform(click())
        onView(withId(R.id.tv_option_one)).perform(click())
        onView(withId(R.id.btn_submit)).perform(click())
    }

    @Test
    fun canSubmitAnswersQ2() {
        onView(withId(R.id.et_name)).perform(typeText("Thrishul"))
        closeSoftKeyboard()
        onView(withId(R.id.btn_start)).perform(click())
        onView(withId(R.id.tv_option_one)).perform(click())
        onView(withId(R.id.btn_submit)).perform(click())
        onView(withId(R.id.tv_question)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_question)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_option_two)).perform(click())
        onView(withId(R.id.btn_submit)).perform(click())
    }

    @Test
    fun canSubmitAnswersQ3() {
        onView(withId(R.id.et_name)).perform(typeText("Thrishul"))
        closeSoftKeyboard()
        onView(withId(R.id.btn_start)).perform(click())
        onView(withId(R.id.tv_option_one)).perform(click())
        onView(withId(R.id.btn_submit)).perform(click())
        onView(withId(R.id.tv_option_two)).perform(click())
        onView(withId(R.id.btn_submit)).perform(click())
        onView(withId(R.id.tv_question)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_option_three)).perform(click())
        onView(withId(R.id.btn_submit)).perform(click())
    }


}