package com.epi.epiapp.Encuesta;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.epi.epiapp.R;

import Model.RiesgoAmbiental2;
import Model.RiesgoAmbiental3;
import Model.Vivienda;

public class EncuestaRiesgoAmbental3 extends ActionBarActivity
{
    private Spinner spinerInfo;
    private Spinner spinerDanoPlantas;
    private Spinner spinerDanoAnimal;
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
        spinerDanoPlantas=(Spinner)findViewById(R.id.spinerDanosPlantas);
        spinerDanoAnimal=(Spinner)findViewById(R.id.spinerDanoAnimal);
        spinerNinoEspu=(Spinner)findViewById(R.id.spinerNinosEspuestos);


        ArrayAdapter adapter1 = new ArrayAdapter<>(EncuestaRiesgoAmbental3.this,android.R.layout.simple_spinner_item,pregunta_9);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinerInfo.setAdapter(adapter1);

        ArrayAdapter adapter2 = new ArrayAdapter<>(EncuestaRiesgoAmbental3.this,android.R.layout.simple_spinner_item,pregunta_10);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinerDanoPlantas.setAdapter(adapter2);

        ArrayAdapter adapter3 = new ArrayAdapter<>(EncuestaRiesgoAmbental3.this,android.R.layout.simple_spinner_item,pregunta_11);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinerDanoAnimal.setAdapter(adapter3);

        ArrayAdapter adapter4 = new ArrayAdapter<>(EncuestaRiesgoAmbental3.this,android.R.layout.simple_spinner_item,pregunta_12);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinerNinoEspu.setAdapter(adapter4);


    }

    public boolean onCreateOptionMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_encuesta_riesgo_ambental3,menu);
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
            // validateItems();
        }

        return super.onOptionsItemSelected(item);
    }

   /* private void validateItems() {

        String nombre = nombreET.getText().toString();
        String edad = edadET.getText().toString();
        String calle = calleET.getText().toString();
        String num = numeroET.getText().toString();

        if (!nombre.isEmpty() && !edad.isEmpty() && !calle.isEmpty() && !num.isEmpty() ){
            nextStep();
        } else {
            Toast.makeText(EncuestaParteInicial.this, "Debe completar todos los campos", Toast.LENGTH_SHORT).show();
        }

    }*/

    private void nextStep()
    {
        Vivienda vivienda = new Vivienda();
        vivienda.setR3(objeto1());

        //Intent i = new Intent(EncuestaRiesgoAmbental3.this,EncuestaRiesgoAmbental3.class);
       // i.putExtra("RA1",(Vivienda)vivienda);
        //startActivity(i);

    }

    private RiesgoAmbiental3 objeto1()
    {
        RiesgoAmbiental3 model = new RiesgoAmbiental3();
        model.setPregunta9(spinerInfo.getSelectedItemPosition());
        model.setPregunta10(spinerDanoPlantas.getSelectedItemPosition());
        model.setPregunta11(spinerDanoAnimal.getSelectedItemPosition());
        model.setPregunta12(spinerNinoEspu.getSelectedItemPosition());

        return model;
    }


}
