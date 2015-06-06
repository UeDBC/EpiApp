package com.epi.epiapp.Encuesta;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.epi.epiapp.R;

public class EncuestaRiesgoAmbiental2 extends ActionBarActivity
{
    private Spinner spiner_avioneta;
    private Spinner spiner_guarda_agrotoxico;
    private Spinner spiner_guarda_envase;
    private Spinner reutiliza_envases;

    String [] pregunta_5={"Si","No","No sabe"};
    String [] pregunta_6={"Si","No","No sabe"};
    String [] pregunta_7={"Si","No","No sabe"};
    String [] pregunta_8={"Si","No","No sabe"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta_riesgo_ambiental2);

        spiner_avioneta=(Spinner)findViewById(R.id.spinnerAvioneta);
        spiner_guarda_agrotoxico=(Spinner)findViewById(R.id.spinerGuardaAgro);
        spiner_guarda_envase=(Spinner)findViewById(R.id.spinerGuardaBotellasVacias);
        reutiliza_envases=(Spinner)findViewById(R.id.spinerReutilizaPlagic);

        ArrayAdapter adapter1 = new ArrayAdapter<>(EncuestaRiesgoAmbiental2.this,android.R.layout.simple_spinner_item,pregunta_5);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner_avioneta.setAdapter(adapter1);

        ArrayAdapter adapter2 = new ArrayAdapter<>(EncuestaRiesgoAmbiental2.this,android.R.layout.simple_spinner_item,pregunta_6);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner_guarda_agrotoxico.setAdapter(adapter2);

        ArrayAdapter adapter3 = new ArrayAdapter<>(EncuestaRiesgoAmbiental2.this,android.R.layout.simple_spinner_item,pregunta_7);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner_guarda_envase.setAdapter(adapter3);

        ArrayAdapter adapter4 = new ArrayAdapter<>(EncuestaRiesgoAmbiental2.this,android.R.layout.simple_spinner_item,pregunta_8);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        reutiliza_envases.setAdapter(adapter4);

    }


}
