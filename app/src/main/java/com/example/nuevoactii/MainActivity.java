package com.example.nuevoactii;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText Edad ;
    int n;

    //String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Edad = findViewById(R.id.Edad);
    }

    public void enviardatos(View view){
        Intent enviar = new Intent(this,Activity2.class);

       n = Integer.parseInt(Edad.getText().toString());
        String num= Integer.toString(n);
        enviar.putExtra("dato01",num);
        enviar.putExtra("dato02","");
        startActivity(enviar);

    }

}