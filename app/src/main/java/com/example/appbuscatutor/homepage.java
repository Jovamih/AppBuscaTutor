package com.example.appbuscatutor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_homepage_vista_tutores);
        super.onCreate(savedInstanceState);
        //obtener el Intent de la actividad actual recien creada
        Intent intent=getIntent();
        //Obtener el ID usuario  que la interfaz anterior envio
        //String id_usuario=intent.getStringExtra("id_usuario");
        createItemTutores(10);

    }

    private void createItemTutores(int n) {
        List<ListTutoresFavoritos> lista_tutores = new ArrayList<>();
        for(int i=0;i<n;i++){
            lista_tutores.add(new ListTutoresFavoritos("Lana Rohades","Es habilidosa","https://tinyurl.com/4m6nytvh"));
        }

        ListAdapter listAdapter= new ListAdapter(lista_tutores,this);
        RecyclerView recyclerView= findViewById(R.id.lista_items);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }

}