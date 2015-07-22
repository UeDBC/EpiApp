package com.epi.epiapp.Encuesta;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.epi.epiapp.R;

import Model.Encuesta;
import Model.Respuesta;
import Model.Vivienda;

public class EncuestaViviendas extends ActionBarActivity {

    private Spinner spinnerPregunta1;
    private Spinner spinnerPregunta2;
    private Spinner spinnerPregunta3;
    private Spinner spinnerPregunta4;
    private Spinner spinnerPregunta5;

    String[] opcionesPregunta1= {"Menos de 1 año", "De 1 a 5 años", "De 6 a 10 años", "Más de 10 años"};
    String[] opcionesPregunta2= {"Sí","No"};
    String[] opcionesPregunta3= {"Sí","No"};
    String[] opcionesPregunta4= {"Sí","No"};
    String[] opcionesPregunta5= {"Sí","No"};

    private Encuesta encuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta_viviendas);
        spinnerPregunta1 = (Spinner) findViewById(R.id.spinnerPregunta1);
        spinnerPregunta2 = (Spinner) findViewById(R.id.spinnerPregunta2);
        spinnerPregunta3 = (Spinner) findViewById(R.id.spinnerPregunta3);
        spinnerPregunta4 = (Spinner) findViewById(R.id.spinnerPregunta4);
        spinnerPregunta5 = (Spinner) findViewById(R.id.spinnerPregunta5);


        ArrayAdapter adapter1 =new ArrayAdapter<>(EncuestaViviendas.this, android.R.layout.simple_spinner_item, opcionesPregunta1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPregunta1.setAdapter(adapter1);

        ArrayAdapter adapter2 =new ArrayAdapter<>(EncuestaViviendas.this, android.R.layout.simple_spinner_item, opcionesPregunta2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPregunta2.setAdapter(adapter2);

        ArrayAdapter adapter3 =new ArrayAdapter<>(EncuestaViviendas.this, android.R.layout.simple_spinner_item, opcionesPregunta3);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPregunta3.setAdapter(adapter3);

        ArrayAdapter adapter4 =new ArrayAdapter<>(EncuestaViviendas.this, android.R.layout.simple_spinner_item, opcionesPregunta4);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPregunta4.setAdapter(adapter4);

        ArrayAdapter adapter5 =new ArrayAdapter<>(EncuestaViviendas.this, android.R.layout.simple_spinner_item, opcionesPregunta5);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPregunta5.setAdapter(adapter5);

        encuesta = (Encuesta) getIntent().getSerializableExtra("encuesta");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_encuesta_viviendas, menu);
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
            nextStep();
        }

        return super.onOptionsItemSelected(item);
    }

    private void nextStep() {


        int tiempoQueVivenEnVivienda = spinnerPregunta1.getSelectedItemPosition();

        int tieneAguaDeRedOpcion = spinnerPregunta2.getSelectedItemPosition();
        boolean tieneAguaDeRed = false;
        if (tieneAguaDeRedOpcion == 0){
            tieneAguaDeRed = true;
        }

        int callePavOpcion = spinnerPregunta3.getSelectedItemPosition();
        boolean callePav = false;
        if (callePavOpcion == 0){
            callePav = true;
        }

        int tanqueAguaOpcion = spinnerPregunta4.getSelectedItemPosition();
        boolean tanqueAguaConTapa = false;
        if (tanqueAguaOpcion == 0){
            tanqueAguaConTapa = true;
        }

        int realizoLimpiezaTanqueOpcion = spinnerPregunta5.getSelectedItemPosition();
        boolean realizoLimpiezaTanque = false;
        if (realizoLimpiezaTanqueOpcion == 0){
            realizoLimpiezaTanque = true;
        }



        Vivienda vivienda = encuesta.getVivienda();

        vivienda.getRespuestas().add(new Respuesta(13, String.valueOf(tieneAguaDeRed)));
        vivienda.getRespuestas().add(new Respuesta(14, String.valueOf(callePav)));
        vivienda.getRespuestas().add(new Respuesta(15, String.valueOf(realizoLimpiezaTanque)));
        vivienda.getRespuestas().add(new Respuesta(16, String.valueOf(tanqueAguaConTapa)));
        vivienda.getRespuestas().add(new Respuesta(17, String.valueOf(tiempoQueVivenEnVivienda)));


        encuesta.setVivienda(vivienda);

        Intent i = new Intent(EncuestaViviendas.this,EncuestaRiesgoAmbiental1.class);
        i.putExtra("encuesta",encuesta);
        startActivity(i);
    }
}
