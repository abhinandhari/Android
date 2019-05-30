package com.example.listapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<Fruit> { //to add views. This is custom view
    public FruitAdapter(Context context, List<Fruit> fruits) { //context check online
        super(context, 0, fruits);
    }

    @NonNull
    @Override

    public View getView(int pos, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null)
    listItemView = LayoutInflater.from(getContext()).inflate(R.layout.fruit_list, parent, false);
    //inflater = making the view
    Fruit currentFruit = getItem(pos);
    ImageView imageView=listItemView.findViewById(R.id.iv_fruit);
    TextView textView=listItemView.findViewById(R.id.tv_fruit);
        imageView.setImageResource(currentFruit.getImage());
        textView.setText(currentFruit.getName());
        return listItemView;
}
}
