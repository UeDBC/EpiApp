package com.epi.epiapp.Encuesta;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.epi.epiapp.R;

public class EncuestaRiesgoAmbental3 extends ActionBarActivity
{
    private Spinner spinerInfo;
    private Spinner spinerDa�oPlantas;
    private Spinner spinerDa�oAnimal;
    private Spinner spinerNinoEspu;

    String [] pregunta_9={"Si","No"};
    String [] pregunta_10={"Si","No","No sabe"};
    String [] pregunta_11={"Si","No","No sabe"};
    String [] pregunta_12={"Si","No","No sabe"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta_riesgo_ambental3);

        spinerInfo=(Spinner)findViewById(R.id.spinnerInfo);
        spinerDa�oPlantas=(Spinner)findViewById(R.id.spinerDa�osPlantas);
        spinerDa�oAnimal=(Spinner)findViewById(R.id.spinerDa�oAnimal);
        spinerNinoEspu=(Spinner)findViewById(R.id.spinerNi�osEspuestos);


        ArrayAdapter adapter1 = new ArrayAdapter<>(EncuestaRiesgoAmbental3.this,android.R.layout.simple_spinner_item,pregunta_9);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinerInfo.setAdapter(adapter1);

        ArrayAdapter adapter2 = new ArrayAdapter<>(EncuestaRiesgoAmbental3.this,android.R.layout.simple_spinner_item,pregunta_10);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinerDa�oPlantas.setAdapter(adapter2);

        ArrayAdapter adapter3 = new ArrayAdapter<>(EncuestaRiesgoAmbental3.this,android.R.layout.simple_spinner_item,pregunta_11);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinerDa�oAnimal.setAdapter(adapter3);

        ArrayAdapter adapter4 = new ArrayAdapter<>(EncuestaRiesgoAmbental3.this,android.R.layout.simple_spinner_item,pregunta_12);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinerNinoEspu.setAdapter(adapter4);


    }


}
