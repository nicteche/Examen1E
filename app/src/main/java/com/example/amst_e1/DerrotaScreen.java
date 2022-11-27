package com.example.amst_e1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DerrotaScreen extends AppCompatActivity {
    private Button btnSalir, btnRegresar;
    private TextView numResp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derrota_screen);
        btnSalir= (Button) findViewById(R.id.btnSalirD);
        btnRegresar= (Button) findViewById(R.id.btnRegresarG);
    }

    public void salir(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void regresar(View view){
        Intent intent = new Intent(this,TriviaCine.class);
        startActivity(intent);
    }
    public void onClick(View v) {
        if(v.getId() == R.id.btnSalirD){
            Log.d("mensaje","ïngreso");
        }else
            System.out.println("No hay");
    }
}
