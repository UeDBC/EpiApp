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

public class EncuestaRiesgoAmbiental1 extends ActionBarActivity
{
    private Spinner agro_toxico;
    private Spinner lava_ropa;
    private Spinner fumigan;
    private Spinner mosquito;
    private Encuesta encuesta;

    String [] pregunta_agro={"Si","No","No sabe"};
    String [] pregunta_lava={"Si","No","No sabe"};
    String [] pregunta_fumiga={"Si","No","No sabe"};
    String [] pregunta_mosquito={"Si","No","No sabe"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta_riesgo_ambiental1);

        encuesta= (Encuesta)this.getIntent().getExtras().get("encuesta");

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_encuesta_riesgo_ambiental1,menu);
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
            nextStep();
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
        Vivienda vivienda = encuesta.getVivienda();

        vivienda.getRespuestas().add(new Respuesta(1, String.valueOf(agro_toxico.getSelectedItemPosition())));
        vivienda.getRespuestas().add(new Respuesta(2, String.valueOf(lava_ropa.getSelectedItemPosition())));
        vivienda.getRespuestas().add(new Respuesta(3, String.valueOf(fumigan.getSelectedItemPosition())));
        vivienda.getRespuestas().add(new Respuesta(4, String.valueOf(mosquito.getSelectedItemPosition())));


        Intent i = new Intent(EncuestaRiesgoAmbiental1.this,EncuestaRiesgoAmbiental2.class);
        i.putExtra("encuesta",(Encuesta)encuesta);
        startActivity(i);

    }

}
