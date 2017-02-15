package com.example.ftrani.petagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MascotasFavoritasActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    public MascotaAdaptador adaptador;
    private ImageButton btnLikes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_mascotas);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        ImageButton btnLikes = (ImageButton) findViewById(R.id.btnLikes);
        TextView tituloActionBar = (TextView) findViewById(R.id.txtTitulo);
        tituloActionBar.setText("5 Favoritos");

        btnLikes.setEnabled(false);

        setSupportActionBar(miActionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        //indicamos al recyclerview que se comporte como linearlayout
        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();

    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.king_charles_spaniel,22,"PINTA","King Charles Spaniel"));
        mascotas.add(new Mascota(R.drawable.husky_siberiano,18,"PAMPA","Husky Siberiano"));
        mascotas.add(new Mascota(R.drawable.beagle,15,"MAKO","Beagle"));
        mascotas.add(new Mascota(R.drawable.boxer,7,"RAMON","Boxer"));
        mascotas.add(new Mascota(R.drawable.caniche,13,"JAZMIN","Caniche"));


    }

    public void irMascotasFavoritas(View v){
        //Intent intent = new Intent(this, MascotasFavoritasActivity.class);
        //startActivity(intent);
    }

}
