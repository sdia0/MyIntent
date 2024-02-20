package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button sendBtn;
    EditText lastName, name, fatherName, age;
    String lastnameTxt, nameTxt, fatherNameTxt, ageTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lastName = findViewById(R.id.lastName);
        name = findViewById(R.id.name);
        fatherName = findViewById(R.id.fatherName);
        age = findViewById(R.id.age);

        sendBtn = findViewById(R.id.sendBtn);

        sendBtn.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                lastnameTxt = String.valueOf(lastName.getText());
                nameTxt = String.valueOf(name.getText());
                fatherNameTxt = String.valueOf(fatherName.getText());
                ageTxt = String.valueOf(age.getText());
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("s", lastnameTxt);
                intent.putExtra("n", nameTxt);
                intent.putExtra("p", fatherNameTxt);
                intent.putExtra("a", ageTxt);
                startActivity(intent);
            }
        });

    }


}