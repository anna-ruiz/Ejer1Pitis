package com.example.ejer1pitis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView lbNumeroPitis;
    private TextView lbDineroAhorrado;
    private ImageButton btnFumarPti;
    private int dinero;
    private int pitis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pitis = 20;
        dinero = 0;

        inicializarVista();
        actualizarDatos();


        btnFumarPti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pitis == 1){
                    dinero +=5;
                    pitis = 20;
                }else{
                    pitis--;
                }
                actualizarDatos();
            }
        });
    }

    private void actualizarDatos() {
        lbNumeroPitis.setText("Quedan "+ pitis +" pitis en el paquete");
        lbDineroAhorrado.setText("Has ahorrado " + dinero + " €");
    }

    private void inicializarVista() {
        lbNumeroPitis = findViewById(R.id.txtNumeroPitis);
        lbDineroAhorrado = findViewById(R.id.txtDineroAhorrado);
        btnFumarPti = findViewById(R.id.btnFumarPiti);
    }



}