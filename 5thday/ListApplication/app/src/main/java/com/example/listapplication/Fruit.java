package com.example.listapplication;

public class Fruit {
    int image;
    String name;
    public Fruit(String name, int image){
        this.image=image;
        this.name=name;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }
}
