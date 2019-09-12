package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AccessControl extends AppCompatActivity {
    public String tracker = "";
    //have a variable that maintains code you are on.

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_control);
            //this comes with it

        b1 = findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               tracker += "1";

                //code to click it and remember the order
            }
        });

        b2 = findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tracker += "2";
                //code to click it and remember the order
            }
        });

        b3 = findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tracker += "3";
                //code to click it and remember the order
            }
        });

        b4 = findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tracker += "4";
                //code to click it and remember the order
            }
        });

        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // boolean passcode;
                //passcode = false;
                if (tracker.equals ("1234")){
                    //passcode = true;
                    Intent toMainTrue = new Intent(getApplicationContext(), MainActivity.class);
                    toMainTrue.putExtra("Update", "Unlocked");
                    startActivity(toMainTrue);
                }
                else{
                    Intent mainFalse = new Intent(getApplicationContext(), MainActivity.class);
                    mainFalse.putExtra("Update", "Locked");
                    startActivity(mainFalse);
                }
                tracker = "";
                //code to return to welcome screen
            }
        });

    }
/*
    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        boolean passcode;
            passcode = false;
            if (tracker.equals ("1234")){
                passcode = true;
            }
        }

*/

}
