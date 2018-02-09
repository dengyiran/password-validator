package com.example.dengyiran.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.button);
        final TextView textView = findViewById(R.id.textView);
        final EditText editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Code here executes on main thread after user presses button
                password_validator pv = new password_validator();
                if (pv.checklength(editText.getText().toString()) != 0) {
                    textView.setText("Password must over 8 digits");
                }
                else if (pv.checkequal(editText.getText().toString()) !=1) {
                    textView.setText("'password' can not be used as password");
                }
                else if (pv.checkdigits(editText.getText().toString()) != 102) {
                    textView.setText("Low");
                }
                else if (pv.checklower(editText.getText().toString()) != 103) {
                    textView.setText("medium");
                }
                else if (pv.checkupper(editText.getText().toString()) != 104) {
                    textView.setText("high");
                }
            }
        });
    }
}
