package com.example.listviewpersonalizado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvItems;
    private Adaptador adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems=(ListView)findViewById(R.id.lvItems);
        adaptador=new Adaptador(this,GetArrayItems());
        lvItems.setAdapter(adaptador);
    }
    private ArrayList<Entidad> GetArrayItems(){
        ArrayList<Entidad> listItems = new ArrayList<>();
        listItems.add(new Entidad(R.drawable.imagen1,"Usuario","Acceder como usuario"));
        listItems.add(new Entidad(R.drawable.imagen2,"Entidad","Acceder como Entidad"));
        return listItems;
    }
}