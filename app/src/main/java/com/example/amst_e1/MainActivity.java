package com.example.amst_e1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Button  btnIngreso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIngreso = (Button) findViewById(R.id.btnIngreso);

    }

    public void ingresar(View view){
        Intent intent = new Intent(this,TriviaCine.class);
        startActivity(intent);
    }
    public void onClick(View v) {
        if(v.getId() == R.id.btnIngreso){
            Log.d("mensaje","ïngreso");
        }else
            System.out.println("No hay");
    }
}