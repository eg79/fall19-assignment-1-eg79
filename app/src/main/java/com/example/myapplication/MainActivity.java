package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button unlock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            //this comes with it

        TextView status = findViewById(R.id.status);
        Bundle extras = getIntent().getExtras();
            if(extras != null){
                String statusreport = extras.getString("Update");
                if(statusreport.equals ("Locked")){
                    status.setText("the application is locked");
                }
                if(statusreport.equals ("Unlocked")){
                    status.setText("the application is unlocked");
                }
            }
            /*else{
                status.setText("the application is unlocked");
            }*/


        unlock = findViewById(R.id.unlock);
        unlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAccessControl();
            }
        });
    }

    public void openAccessControl() {
        Intent intent = new Intent(this, AccessControl.class);
        startActivity(intent);}

}
