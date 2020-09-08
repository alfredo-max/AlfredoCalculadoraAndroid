package com.example.alfredocalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
    public boolean ValidarVacio(String n1,String n2){

        boolean vacio=false;
        if(n1.isEmpty()){
            text_valor1.setError("Este campo no puede quedar vacio");
            vacio=true;
        }
        if(n2.isEmpty()){
            text_valor2.setError("Este campo no puede quedar vacio");
            vacio=true;
        }

        return vacio;
    }

    public void Sumar(View view){
         String valor1=text_valor1.getText().toString();
         String valor2=text_valor2.getText().toString();
         if(!ValidarVacio(valor1,valor2)){
             double num1= Double.parseDouble(valor1);
             double num2= Double.parseDouble(valor2);
             String resultado= String.valueOf(num1+num2);
             text_resultado.setText(resultado);
         }
    }

    public void Resta(View view){
        String valor1=text_valor1.getText().toString();
        String valor2=text_valor2.getText().toString();

        if(!ValidarVacio(valor1,valor2)){
            double num1= Double.parseDouble(valor1);
            double num2= Double.parseDouble(valor2);
            String resultado= String.valueOf(num1-num2);
            text_resultado.setText(resultado);
        }

    }

    public void Multiplicacion(View view){
        String valor1=text_valor1.getText().toString();
        String valor2=text_valor2.getText().toString();

        if(!ValidarVacio(valor1,valor2)){
            double num1= Double.parseDouble(valor1);
            double num2= Double.parseDouble(valor2);
            String resultado= String.valueOf(num1*num2);
            text_resultado.setText(resultado);
        }

    }
    public void Division(View view){
        String valor1=text_valor1.getText().toString();
        String valor2=text_valor2.getText().toString();
        if(!ValidarVacio(valor1,valor2)) {
            double num1= Double.parseDouble(valor1);
            double num2= Double.parseDouble(valor2);
            if(num2!=0){
                String resultado= String.valueOf(num1/num2);
                text_resultado.setText(resultado);
            }else{
                text_resultado.setText("No se puede dividir por cero");
            }
        }
    }


    public boolean validarEntero(double n1, double n2){
         boolean entero=true;
         if(n1 % 1 !=0){
             text_valor1.setError("ingrese un numero entero");
           entero=false;
         }
         if(n2 % 2 !=0){
             text_valor2.setError("ingrese un numero entero");
             entero=false;
         }

         return  entero;
    }
    public  boolean validarCero(double n1, double n2){
        boolean cero=false;
        if(n1==0){
            text_valor1.setError("Este valor no puede ser cero");
            cero=true;
        }
        if(n2==0){
            text_valor2.setError("Este valor no puede ser cero");
            cero=true;
        }

        return  cero;
    }
    public void MCD(View view){
        String valor1=text_valor1.getText().toString();
        String valor2=text_valor2.getText().toString();

        if(!ValidarVacio(valor1,valor2)) {
            double num1= Math.abs(Double.parseDouble(valor1));
            double num2= Math.abs(Double.parseDouble(valor2));
            if(validarEntero(num1,num2)  && !validarCero(num1,num2)){
                while(num1 != num2) {
                    if (num1 > num2)
                        num1 = num1 - num2;
                    else
                        num2 = num2 - num1;
                }
                text_resultado.setText("El MCD es: "+num1);
            }

        }
    }

    public void MCM(View view){
        String valor1=text_valor1.getText().toString();
        String valor2=text_valor2.getText().toString();

        if(!ValidarVacio(valor1,valor2)) {

            double num1 = Math.abs(Double.parseDouble(valor1));
            double num2 = Math.abs(Double.parseDouble(valor2));
            int mcm, i;
            mcm = 1;
            i = 2;
            if (validarEntero(num1, num2) && !validarCero(num1,num2)) {
                while (i <= num1 || i <= num2) {
                    if (num1 % i == 0 || num2 % i == 0) {
                        mcm = mcm * i;
                        if (num1 % i == 0) num1 = num1 / i;
                        if (num2 % i == 0) num2 = num2 / i;
                    } else
                        i = i + 1;
                }
                text_resultado.setText("El MCM es: " + mcm);
            }
        }
    }


    public void mayor(View view){
        String valor1=text_valor1.getText().toString();
        String valor2=text_valor2.getText().toString();

        if(!ValidarVacio(valor1,valor2)){
            double num1= Double.parseDouble(valor1);
            double num2= Double.parseDouble(valor2);
            String mayor;
            if(num1>num2){
                text_resultado.setText(String.valueOf(num1));
            }else if(num2>num1){
                text_resultado.setText(String.valueOf(num2));
            }else{
                text_resultado.setText("Son iguales");
            }

        }
    }



}