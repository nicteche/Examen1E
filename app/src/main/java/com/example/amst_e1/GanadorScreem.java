package com.example.amst_e1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class GanadorScreem extends AppCompatActivity {
    private Button btnSalirG, btnRegresarG;
    private TextView numPreg;
    private List<String> preguntas, img;
    private ArrayList<List> respuestas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganador_screem);
        btnSalirG= (Button) findViewById(R.id.btnSalirG);
        List<String> preguntas= new List<String>("Cual villano de los increibles?","Que poder tiene Dash?","Cual esa la identidad secreta de Spider-Man","Como se llama el tio de Spiderman?","Cual es el enemigo de Spider-Man?")

    }

    public void salir(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}