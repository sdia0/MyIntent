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

        lastName.setText(MainActivity.lastnameTxt);
        name.setText(MainActivity.nameTxt);
        patron.setText(MainActivity.fatherNameTxt);
        age.setText(MainActivity.ageTxt);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}