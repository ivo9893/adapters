package com.example.adapters;

import android.graphics.drawable.Drawable;

public class Animal {
    private int drawableID;
    private String name;

    public Animal(int drawableID, String name) {
        this.drawableID = drawableID;
        this.name = name;
    }

    public int getDrawableID() {
        return drawableID;
    }

    public String getName() {
        return name;
    }
}
