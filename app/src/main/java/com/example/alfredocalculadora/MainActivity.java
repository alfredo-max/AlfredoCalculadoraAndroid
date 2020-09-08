package com.example.alfredocalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText text_valor1,text_valor2;
    private TextView text_resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_valor1= (EditText)findViewById(R.id.text_valor1);
        text_valor2= (EditText)findViewById(R.id.text_valor2);
        text_resultado=(TextView)findViewById(R.id.txt_resultado);
    }

    // suma


    public void Sumar(View view){

         int num1= Integer.parseInt(text_valor1.getText().toString());
         int num2= Integer.parseInt(text_valor2.getText().toString());
         String resultado= String.valueOf(num1+num2);
         text_resultado.setText(resultado);
    }

    public void Resta(View view){
        int num1= Integer.parseInt(text_valor1.getText().toString());
        int num2= Integer.parseInt(text_valor2.getText().toString());
        String resultado= String.valueOf(num1-num2);
        text_resultado.setText(resultado);
    }

    public void Multiplicacion(View view){
        int num1= Integer.parseInt(text_valor1.getText().toString());
        int num2= Integer.parseInt(text_valor2.getText().toString());
        String resultado= String.valueOf(num1*num2);
        text_resultado.setText(resultado);
    }
    public void Division(View view){
        int num1= Integer.parseInt(text_valor1.getText().toString());
        int num2= Integer.parseInt(text_valor2.getText().toString());
        String resultado= String.valueOf(num1/num2);
        text_resultado.setText(resultado);
    }

    /*
    public int resta(int a,int b){
        return a-b;
    }
    public int multiplicacion(int a,int b){
        return a*b;
    }
    public int division(int a,int b){
        return a/b;
    }
   */

}