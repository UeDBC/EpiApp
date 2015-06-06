package com.epi.epiapp.Encuesta;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.epi.epiapp.R;

public class EncuestaRiesgoAmbiental1 extends ActionBarActivity
{
    private Spinner agro_toxico;
    private Spinner lava_ropa;
    private Spinner fumigan;
    private Spinner mosquito;

    String [] pregunta_agro={"Si","No","No sabe"};
    String [] pregunta_lava={"Si","No","No sabe"};
    String [] pregunta_fumiga={"Si","No","No sabe"};
    String [] pregunta_mosquito={"Si","No","No sabe"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta_riesgo_ambiental1);

        agro_toxico= (Spinner)findViewById(R.id.spinnerAgrotoxico);
        lava_ropa= (Spinner)findViewById(R.id.LavaRopa);
        fumigan= (Spinner)findViewById(R.id.Fumigan);
        mosquito=(Spinner)findViewById(R.id.Mosquito);


        ArrayAdapter adapter1 = new ArrayAdapter<>(EncuestaRiesgoAmbiental1.this,android.R.layout.simple_spinner_item,pregunta_agro);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        agro_toxico.setAdapter(adapter1);

        ArrayAdapter adapter2= new ArrayAdapter<>(EncuestaRiesgoAmbiental1.this,android.R.layout.simple_spinner_item,pregunta_lava);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lava_ropa.setAdapter(adapter2);

        ArrayAdapter adapter3= new ArrayAdapter<>(EncuestaRiesgoAmbiental1.this,android.R.layout.simple_spinner_item,pregunta_fumiga);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fumigan.setAdapter(adapter3);

        ArrayAdapter adapter4= new ArrayAdapter<>(EncuestaRiesgoAmbiental1.this,android.R.layout.simple_spinner_item,pregunta_mosquito);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mosquito.setAdapter(adapter4);



    }

}
