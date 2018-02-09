package com.example.dengyiran.myapplication;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Created by dengyiran on 18/2/9.
 */

public class simpleespressotest {
    private String password;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void check0Activity() {
        password = "qweEWQE123";
        onView(withId(R.id.editText))
                .perform(typeText(password), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView))
                .check(matches(withText("high")));
    }

    @Test
    public void check1Activity() {
        password = "qwe21321321";
        onView(withId(R.id.editText))
                .perform(typeText(password), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView))
                .check(matches(withText("medium")));
    }

    @Test
    public void check2Activity() {
        password = "12312423";
        onView(withId(R.id.editText))
                .perform(typeText(password), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView))
                .check(matches(withText("Low")));
    }

    @Test
    public void check3Activity() {
        password = "password";
        onView(withId(R.id.editText))
                .perform(typeText(password), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView))
                .check(matches(withText("'password' can not be used as password")));
    }

    @Test
    public void check4Activity() {
        password = "13qwe";
        onView(withId(R.id.editText))
                .perform(typeText(password), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView))
                .check(matches(withText("Password must over 8 digits")));
    }
}
