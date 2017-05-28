package com.example.perk.assignment2_b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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

    public void buttonOnClick(View v){
        TextView a = (TextView)findViewById(R.id.passwordEdit);
        TextView b = (TextView)findViewById(R.id.textView);

        if(checkPassword(String.valueOf(a.getText())))b.setText("Password Secure");
        else b.setText("Password Insecure");
    }
}
