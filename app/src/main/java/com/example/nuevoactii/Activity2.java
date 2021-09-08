package com.example.nuevoactii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

TextView tvdatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        recibirdatos();
    }
    public void iniciaractivity1(View view){
        //Context context =getApplicationContext();
        //CharSequence text = "ke paza larva";
        //int duration = Toast.LENGTH_SHORT;
        Intent activity1 = new Intent(this,MainActivity.class);
        startActivity(activity1);
        Toast toast = Toast.makeText(getApplicationContext(),"ke paza larva",Toast.LENGTH_SHORT);
        toast.show();

    }
   public void  recibirdatos(){
        Bundle extras  = getIntent().getExtras();
        String dato1 = extras.getString("dato01");
       String dato2 = extras.getString("dato02");
       tvdatos = (TextView) findViewById(R.id.tvdatos);
       tvdatos.setText(dato1+dato2);
   }
}