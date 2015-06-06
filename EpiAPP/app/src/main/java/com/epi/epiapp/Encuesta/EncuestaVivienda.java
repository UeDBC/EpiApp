package com.epi.epiapp.Encuesta;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.epi.epiapp.R;

import Model.Encuesta;

/**
 * Created by agus on 06/06/15.
 */
public class EncuestaVivienda extends Activity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_encuesta_vivienda);

        spinnerPregunta1 = (Spinner) findViewById(R.id.spinnerPregunta1);
        spinnerPregunta2 = (Spinner) findViewById(R.id.spinnerPregunta2);
        spinnerPregunta3 = (Spinner) findViewById(R.id.spinnerPregunta3);
        spinnerPregunta4 = (Spinner) findViewById(R.id.spinnerPregunta4);
        spinnerPregunta5 = (Spinner) findViewById(R.id.spinnerPregunta5);


        ArrayAdapter adapter1 =new ArrayAdapter<>(EncuestaVivienda.this, android.R.layout.simple_spinner_item, opcionesPregunta1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPregunta1.setAdapter(adapter1);

        ArrayAdapter adapter2 =new ArrayAdapter<>(EncuestaVivienda.this, android.R.layout.simple_spinner_item, opcionesPregunta2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPregunta2.setAdapter(adapter2);

        ArrayAdapter adapter3 =new ArrayAdapter<>(EncuestaVivienda.this, android.R.layout.simple_spinner_item, opcionesPregunta3);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPregunta3.setAdapter(adapter3);

        ArrayAdapter adapter4 =new ArrayAdapter<>(EncuestaVivienda.this, android.R.layout.simple_spinner_item, opcionesPregunta4);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPregunta4.setAdapter(adapter4);

        ArrayAdapter adapter5 =new ArrayAdapter<>(EncuestaVivienda.this, android.R.layout.simple_spinner_item, opcionesPregunta5);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPregunta5.setAdapter(adapter5);



    }


}
