package com.example.perk.assignment2_b;

import org.junit.Test;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class EspressoUI {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void testPassword(){
        onView(withId(R.id.passwordEdit)).perform(replaceText(""));
        onView(withId(R.id.passwordEdit)).perform(typeText("Password"));
        onView(withId(R.id.Validate)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Password Insecure")));

        onView(withId(R.id.passwordEdit)).perform(replaceText(""));
        onView(withId(R.id.passwordEdit)).perform(typeText("Ab1"));
        onView(withId(R.id.Validate)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Password Insecure")));

        onView(withId(R.id.passwordEdit)).perform(replaceText(""));
        onView(withId(R.id.passwordEdit)).perform(typeText("abboeoibhfoib1"));
        onView(withId(R.id.Validate)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Password Insecure")));

        onView(withId(R.id.passwordEdit)).perform(replaceText(""));
        onView(withId(R.id.passwordEdit)).perform(typeText("IGRFUWIOB4Q2B"));
        onView(withId(R.id.Validate)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Password Insecure")));

        onView(withId(R.id.passwordEdit)).perform(replaceText(""));
        onView(withId(R.id.passwordEdit)).perform(typeText("iuebgipubIUBBUIB"));
        onView(withId(R.id.Validate)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Password Insecure")));

        onView(withId(R.id.passwordEdit)).perform(replaceText(""));
        onView(withId(R.id.passwordEdit)).perform(typeText("SecurePass1"));
        onView(withId(R.id.Validate)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Password Secure")));
    }

}
