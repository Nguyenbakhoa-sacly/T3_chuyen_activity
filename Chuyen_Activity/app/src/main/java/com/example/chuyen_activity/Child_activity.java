package com.example.chuyen_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Child_activity extends AppCompatActivity {
    Button btn_page1;
     View.OnClickListener myEvent = new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent= new Intent(Child_activity.this, Main_activity.class);
             startActivity(intent);
         }
     };
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btn_page1.setOnClickListener(myEvent);
    }

    private void addControls() {
        btn_page1 = (Button) findViewById(R.id.btn_page1);
    }
}