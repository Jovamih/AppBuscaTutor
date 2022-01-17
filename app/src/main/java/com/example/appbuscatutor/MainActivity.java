package com.example.appbuscatutor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button id_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id_btn=findViewById(R.id.id_btnA);
        id_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //cambiar registrar_datos_tutor por su interfaz
                Intent intent = new Intent(MainActivity.this,homepage.class);
                startActivity(intent);
            }
        });
    }
}