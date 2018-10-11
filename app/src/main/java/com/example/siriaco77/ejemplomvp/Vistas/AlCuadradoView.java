package com.example.siriaco77.ejemplomvp.Vistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.example.siriaco77.ejemplomvp.R;
import butterknife.Bind;
import butterknife.ButterKnife;

public class AlCuadradoView extends AppCompatActivity  implements AlCuadrado.view{

    @Bind(R.id.imput_usuario)EditText _userText;
  //  @Bind(R.id.imput_password)EditText _passwordText;


    private EditText editTAlCuadrado;
    //private Button  btnAlCuadrado;
    private TextView txtViewAlCuadrado, txtBorde,txtLabel;

    private AlCuadrado.presentador presente;//creo una interfaz de un tpo y en base a esa creo un objeto

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alcuadradoview);
        ButterKnife.bind(this);
/*        editTAlCuadrado = (EditText) findViewById(R.id.edTAlcuadrado);

        //btnAlCuadrado =(Button) findViewById(R.id.btnAlCuadrado);

        txtViewAlCuadrado =(TextView) findViewById(R.id.txtAlCuadrado);

        presente = new AlCuadradoPresentador(this);*/

        //txtBorde = (TextView) findViewById(R.id.txtBorde);
        //txtLabel =(TextView) findViewById(R.id.txtLabel);


    }

    public void calcular(View view){

        presente.alCuadrado(editTAlCuadrado.getText().toString());

    }

    @Override
    public void showResults(String result) {
        txtViewAlCuadrado.setText(result);
    }
}
