package com.example.pr_22103k_sokolova_practice9;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Selection;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    CheckBox checkBox;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        checkBox = findViewById(R.id.checkBox);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Установите галочку напротив условий использования.", Toast.LENGTH_LONG).show();
            }
        });


        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBox.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Установите галочку напротив условий использования.", Toast.LENGTH_LONG).show();
                } else if (checkBox.isChecked()) {
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //класс Намерение (разрешение на переход в другую форму)
                            Intent intent = new Intent(MainActivity.this, linearLayout.class); //откуда пойти, куда пойти
                            startActivity(intent); //Запустить форму по намерению
                        }
                    });
                }
            }
        });

    }
}