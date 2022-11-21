package com.example.gr1_dz4_3mesias_ulan_continenty_recyclerview_fragmenty;

import java.io.Serializable;

public class Continent implements Serializable {
    private String name;
    private int imageResource;


    public Continent(String name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }


    public Continent() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}