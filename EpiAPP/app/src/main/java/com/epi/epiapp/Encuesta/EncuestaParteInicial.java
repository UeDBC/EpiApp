package com.epi.epiapp.Encuesta;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.epi.epiapp.R;

public class EncuestaParteInicial extends ActionBarActivity {

    EditText nombreET;
    EditText edadET;
    EditText calleET;
    EditText numeroET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta_parte_inicial);

         nombreET = (EditText) findViewById(R.id.nombreET);
         edadET = (EditText) findViewById(R.id.edadET);
         calleET = (EditText) findViewById(R.id.calleET);
         numeroET = (EditText) findViewById(R.id.numeroET);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_encuesta_parte_inicial, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_ok) {
            validateItems();
        }

        return super.onOptionsItemSelected(item);
    }

    private void validateItems() {

        String nombre = nombreET.getText().toString();
        String edad = edadET.getText().toString();
        String calle = calleET.getText().toString();
        String num = numeroET.getText().toString();

        if (!nombre.isEmpty() && !edad.isEmpty() && !calle.isEmpty() && !num.isEmpty() ){
            nextStep();
        } else {
            Toast.makeText(EncuestaParteInicial.this,"Debe completar todos los campos",Toast.LENGTH_SHORT).show();
        }

    }

    private void nextStep() {

        Intent i = new Intent(EncuestaParteInicial.this,EncuestaVivienda.class);
        startActivity(i);

    }
}
