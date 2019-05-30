package com.example.randomjoke3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView setup;
    TextView punchline;
    ImageView checker;
    Button button;
    ArrayList<Joke2> joke2ArrayList = new ArrayList<>();
    Joke joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setup = findViewById(R.id.setup);
        button = findViewById(R.id.button);
        punchline = findViewById(R.id.punchline);
        checker=findViewById(R.id.checker);
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                button.setText("You been long clicking,huh?");
                return false;
            }
        });

    }

    public void generate(View view) {
        checker.setImageResource(R.drawable.type);
        button.setText("U want another one? :3");
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);
        Call<Joke> call = api.getJoke();
        call.enqueue(new Callback<Joke>() {
            @Override
            public void onResponse(Call<Joke> call, Response<Joke> response) {
                Log.v("Api : ", call.request().url().toString());
                joke = response.body();

                if(joke.getType().toString().equals("general")){
                    checker.setImageResource(R.drawable.general);
                }
                else if(joke.getType().toString().equals("programming")){
                    checker.setImageResource(R.drawable.programming);
                }
                else
                    checker.setImageResource(R.drawable.knockknock);
                Joke2 joke2 = new Joke2(R.id.checker,joke);
                joke2ArrayList.add(joke2);

            }

            @Override
            public void onFailure(Call<Joke> call, Throwable t) {
                Log.e("Api : ", "Failed");
            }
        });

        Log.i("ARRAYLIST", joke2ArrayList.toString());
        JokeAdapter jokeAdapter = new JokeAdapter(joke2ArrayList);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setAdapter(jokeAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
