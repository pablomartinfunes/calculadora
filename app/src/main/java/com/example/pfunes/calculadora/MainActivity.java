package com.example.pfunes.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etValor1;
    private EditText etValor2;
    private Button btSumar;
    private TextView tvResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValor1 = (EditText) findViewById(R.id.editTextValor1);
        etValor2 = (EditText) findViewById(R.id.editTextValor2);
        btSumar = (Button) findViewById(R.id.buttonSumar);
        tvResultado = (TextView) findViewById(R.id.textViewResultado);

    }

    public void sumar(View target){
        Float valor1 = Float.valueOf(etValor1.getText().toString());
        Float valor2 = Float.valueOf(etValor2.getText().toString());
        tvResultado.setText(String.valueOf(valor1+valor2));
    }

    public void restar(View target){
        Float valor1= Float.valueOf(etValor1.getText().toString());
        Float valor2= Float.valueOf(etValor2.getText().toString());
        tvResultado.setText(String.valueOf(valor1-valor2));

    }
}
