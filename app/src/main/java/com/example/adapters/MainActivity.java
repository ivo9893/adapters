package com.example.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Animal> array = new ArrayList<>();
        array.add(new Animal(R.drawable.kuche, "Dog"));
        array.add(new Animal(R.drawable.mechka, "Mechka"));
        array.add(new Animal(R.drawable.tigur, "Tigur"));

        listView = findViewById(R.id.list_view);
        AnimalAdapter adapter = new AnimalAdapter(this, array);

        listView.setAdapter(adapter);

    }
}
