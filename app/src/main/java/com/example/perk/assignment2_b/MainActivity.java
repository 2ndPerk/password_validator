package com.example.perk.assignment2_b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static boolean checkPassword(String s) {
        if (Pattern.matches("password", s.toLowerCase())) return false;
        if (s.length() < 8) return false;
        if (!(Pattern.matches(".*\\d.*", s))) return false;
        if (!(Pattern.matches(".*[a-z].*", s))) return false;
        return Pattern.matches(".*[A-Z].*", s);
    }
}
