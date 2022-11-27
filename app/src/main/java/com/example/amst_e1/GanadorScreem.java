package com.example.amst_e1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GanadorScreem extends AppCompatActivity {
    private Button btnSalirG, btnRegresarG;
    private TextView numPreg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganador_screem);
        btnSalirG= (Button) findViewById(R.id.btnSalirG);
    }

    public void salir(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}