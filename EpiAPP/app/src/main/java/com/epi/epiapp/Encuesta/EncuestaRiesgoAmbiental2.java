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
import Model.RiesgoAmbiental1;
import Model.RiesgoAmbiental2;
import Model.Vivienda;

public class EncuestaRiesgoAmbiental2 extends ActionBarActivity
{
    private Spinner spiner_avioneta;
    private Spinner spiner_guarda_agrotoxico;
    private Spinner spiner_guarda_envase;
    private Spinner reutiliza_envases;
    private Encuesta encuesta;

    String [] pregunta_5={"Si","No","No sabe"};
    String [] pregunta_6={"Si","No","No sabe"};
    String [] pregunta_7={"Si","No","No sabe"};
    String [] pregunta_8={"Si","No","No sabe"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta_riesgo_ambiental2);

        encuesta= (Encuesta)this.getIntent().getExtras().get("encuesta");

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

    public boolean onCreateOptionMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_encuesta_riesgo_ambiental2,menu);
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
        vivienda=encuesta.getVivienda();

        vivienda.setR2(objeto1());

        Intent i = new Intent(EncuestaRiesgoAmbiental2.this,EncuestaRiesgoAmbental3.class);
        i.putExtra("encuesta",(Encuesta)encuesta);
        startActivity(i);

    }

    private RiesgoAmbiental2 objeto1()
    {
        RiesgoAmbiental2 model = new RiesgoAmbiental2();
        model.setPregunta5(spiner_avioneta.getSelectedItemPosition());
        model.setPregunta6(spiner_guarda_agrotoxico.getSelectedItemPosition());
        model.setPregunta7(spiner_guarda_envase.getSelectedItemPosition());
        model.setPregunta8(reutiliza_envases.getSelectedItemPosition());

        return model;
    }


}
