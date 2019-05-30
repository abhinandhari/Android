package com.example.randomjoke3;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class JokeAdapter extends RecyclerView.Adapter<JokeAdapter.JokeViewHolder> {

    private List<Joke2> joke2List;

    public JokeAdapter(List<Joke2> joke2List){
        this.joke2List=joke2List;
    }

    @NonNull
    @Override
    public JokeAdapter.JokeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new JokeViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list, viewGroup, false));    }

    @Override
    public void onBindViewHolder(@NonNull JokeAdapter.JokeViewHolder jokeViewHolder , int i) {
        int image = joke2List.get(i).getImage();
        String setup = joke2List.get(i).joke.getSetup();
        String punchline = joke2List.get(i).joke.getPunchline();
        jokeViewHolder.textView1.setText(setup);
        jokeViewHolder.textView2.setText(punchline);
        jokeViewHolder.imageview.setImageResource(image);

    }

    @Override
    public int getItemCount() {
        return joke2List.size();
    }
    public class JokeViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.setup)
        TextView textView1;
        @BindView(R.id.punchline)
        TextView textView2;
        @BindView((R.id.checker))
        ImageView imageview;
        JokeViewHolder(View itemView){
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}