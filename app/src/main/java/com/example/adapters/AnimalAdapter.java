package com.example.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AnimalAdapter extends ArrayAdapter<Animal> {
    public AnimalAdapter(Context context, ArrayList<Animal> animals) {
        super(context, 0, animals);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Animal animal = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.itm_list_item, parent, false);
        }

        ImageView image = convertView.findViewById(R.id.imageView);
        TextView name = convertView.findViewById(R.id.animal_name);

        image.setImageResource(animal.getDrawableID());
        name.setText(animal.getName());

        return convertView;
    }
}
