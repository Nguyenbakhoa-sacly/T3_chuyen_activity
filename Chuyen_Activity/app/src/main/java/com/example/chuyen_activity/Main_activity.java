package com.example.chuyen_activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main_activity extends AppCompatActivity {
    Button btn_page2;

    View.OnClickListener myEvent = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Main_activity.this, Child_activity.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btn_page2.setOnClickListener(myEvent);
    }
    private void addControls() {
        btn_page2 = (Button) findViewById(R.id.btn_page2);
    }
}
