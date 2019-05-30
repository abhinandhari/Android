package com.example.listapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Fruit> fruitArrayList ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fruitArrayList=new ArrayList<>();
        fruitArrayList.add(new Fruit("Apple",R.drawable.apple));
        fruitArrayList.add(new Fruit("Asparagus",R.drawable.asparagus));
        fruitArrayList.add(new Fruit("Aubergine",R.drawable.aubergine));
        fruitArrayList.add(new Fruit("Banana",R.drawable.banana));
        fruitArrayList.add(new Fruit("Avocado",R.drawable.avocado));
        fruitArrayList.add(new Fruit("Bacon",R.drawable.bacon));
        fruitArrayList.add(new Fruit("Baguette",R.drawable.baguette));
        fruitArrayList.add(new Fruit("Beans",R.drawable.beans));
        fruitArrayList.add(new Fruit("Biscuit",R.drawable.biscuit));
        fruitArrayList.add(new Fruit("Boiled Egg",R.drawable.boiled));
        fruitArrayList.add(new Fruit("Blueberries",R.drawable.blueberries));
        fruitArrayList.add(new Fruit("Grapes",R.drawable.grapes));
        fruitArrayList.add(new Fruit("Pomegranate",R.drawable.pomegranate));
        fruitArrayList.add(new Fruit("Raspberry",R.drawable.raspberry));
        fruitArrayList.add(new Fruit("Strawberry",R.drawable.strawberry));
        fruitArrayList.add(new Fruit("Watermelon",R.drawable.watermelon));
        FruitAdapter fruitAdapter=new FruitAdapter(this,fruitArrayList);
        ListView fruitListView = findViewById(R.id.fruitListView);
        fruitListView.setAdapter(fruitAdapter);


    }
}
