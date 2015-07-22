package com.epi.epiapp.Encuesta;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.epi.epiapp.R;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

import Model.Encuesta;
import Model.Respuesta;
import Model.Vivienda;

public class EncuestaRiesgoAmbental3 extends ActionBarActivity
{
    private Spinner spinerInfo;
    private Spinner spinerDanoPlantas;
    private Spinner spinerDanoAnimal;
    private Spinner spinerNinoEspu;

    private Encuesta encuesta;

    String [] pregunta_9={"Si","No"};
    String [] pregunta_10={"Si","No","No sabe"};
    String [] pregunta_11={"Si","No","No sabe"};
    String [] pregunta_12={"Si","No","No sabe"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta_riesgo_ambental3);

        encuesta=(Encuesta)this.getIntent().getExtras().get("encuesta");

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
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
            sendSurvey();
        }

        return super.onOptionsItemSelected(item);
    }

    private void sendSurvey() {

        Vivienda vivienda = encuesta.getVivienda();

        vivienda.getRespuestas().add(new Respuesta(9, String.valueOf(spinerInfo.getSelectedItemPosition())));
        vivienda.getRespuestas().add(new Respuesta(10, String.valueOf(spinerDanoPlantas.getSelectedItemPosition())));
        vivienda.getRespuestas().add(new Respuesta(11, String.valueOf(spinerDanoAnimal.getSelectedItemPosition())));
        vivienda.getRespuestas().add(new Respuesta(12,String.valueOf(spinerNinoEspu.getSelectedItemPosition())));


        Gson gson = new Gson();
        String json = gson.toJson(encuesta);

        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null && activeNetwork.isConnectedOrConnecting();

        if (isConnected) {

        }
//        else {
            try {
                FileWriter file = new FileWriter(getFilesDir().getPath().toString()+"transactionsStack");
                try {
                    file.append(json);

                    System.out.println("Successfully Copied JSON Object to File...");
                    System.out.println("\nJSON Object: " + json);

                } catch (IOException e) {
                    e.printStackTrace();

                } finally {
                    file.flush();
                    file.close();
                }
            } catch (IOException e) {
                Log.d("ERROR",e.getMessage());
                e.printStackTrace();
            }
//        }
    }


}
