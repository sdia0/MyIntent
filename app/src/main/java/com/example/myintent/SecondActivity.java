package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView lastName;
    TextView name;
    TextView patron;
    TextView age;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button = findViewById(R.id.goBack);
        lastName = findViewById(R.id.surnameText);
        name = findViewById(R.id.nameText);
        patron = findViewById(R.id.fatherNameText);
        age = findViewById(R.id.ageText);

        Intent intent = getIntent();
        lastName.setText(intent.getExtras().getString("s"));
        name.setText(intent.getExtras().getString("n"));
        patron.setText(intent.getExtras().getString("p"));
        age.setText(intent.getExtras().getString("a"));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}