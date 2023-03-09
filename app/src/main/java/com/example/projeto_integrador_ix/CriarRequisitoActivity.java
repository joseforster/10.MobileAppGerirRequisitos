package com.example.projeto_integrador_ix;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

import model.ProjetoViewModel;

public class CriarRequisitoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.criar_requisito);

        Spinner spinnerNivelDificuldade = (Spinner) findViewById(R.id.lista_nivel_dificuldade);
        Spinner spinnerNivelImportancia = (Spinner) findViewById(R.id.lista_nivel_importancia);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.niveis, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerNivelDificuldade.setAdapter(adapter);
        spinnerNivelImportancia.setAdapter(adapter);

    }

    public void Cancelar(View view){

        Intent i = new Intent(CriarRequisitoActivity.this, MainActivity.class);

        startActivity(i);
    }

    public void CriarRequisito(View view){

        boolean isValid = true;
        TextView nomeRequisitoElemento = findViewById(R.id.nome_requisito);
        String nomeRequisito = nomeRequisitoElemento.getText().toString();

        if(nomeRequisito.isEmpty()){
            Toast.makeText(this, "Nome do requisito é obrigatório", Toast.LENGTH_SHORT).show();
            isValid = false;
        }

        Spinner projeto = findViewById(R.id.lista_projeto);

        String nomeProjeto = projeto.getSelectedItem().toString();

        if(nomeProjeto.isEmpty()){
            Toast.makeText(this, "Projeto é obrigatório", Toast.LENGTH_SHORT).show();
            isValid = false;
        }

        Spinner nivelDificuldade = findViewById(R.id.lista_nivel_dificuldade);

        if(nivelDificuldade.getSelectedItem().toString().isEmpty()){
            Toast.makeText(this, "Nível de dificuldade é obrigatório", Toast.LENGTH_SHORT).show();
            isValid = false;
        }

        Spinner nivelImportancia = findViewById(R.id.lista_nivel_importancia);

        if(nivelImportancia.getSelectedItem().toString().isEmpty()){
            Toast.makeText(this, "Nível de importância é obrigatório", Toast.LENGTH_SHORT).show();
            isValid = false;
        }

        TextView tempoEstimativa = findViewById(R.id.tempo_estimado);

        if(tempoEstimativa.getText().toString().isEmpty()){
            Toast.makeText(this, "Tempo estimado é obrigatório", Toast.LENGTH_SHORT).show();
            isValid = false;
        }

        if(isValid){


        }
    }
}
