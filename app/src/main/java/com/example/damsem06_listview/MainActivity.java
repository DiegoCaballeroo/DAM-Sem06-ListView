package com.example.damsem06_listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    List<String> estudiantes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        lista = findViewById(R.id.listView);
        estudiantes = new ArrayList<>();
        estudiantes.add("Caballero");
        estudiantes.add("Cañazaca");
        estudiantes.add("Valdivieso");
        estudiantes.add("Flores");
        estudiantes.add("...");
        ArrayAdapter adaptadorEstudiantes = new ArrayAdapter(
                this,
                android.R.layout.simple_expandable_list_item_1,
                estudiantes
        );
        lista.setAdapter(adaptadorEstudiantes);
    }
}