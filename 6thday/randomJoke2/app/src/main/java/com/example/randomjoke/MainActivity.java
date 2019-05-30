package com.example.randomjoke;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setup = findViewById(R.id.setup);
        button = findViewById(R.id.button);
        punchline = findViewById(R.id.punchline);
        checker=findViewById(R.id.checker);
    }

    public void generate(View view) {
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
                Joke joke = response.body();
                setup.setText(joke.getSetup());
                punchline.setText(joke.getPunchline());
                if(joke.getType().toString().equals("general")){
                    checker.setImageResource(R.drawable.general);
                }
                else if(joke.getType().toString().equals("programming")){
                    checker.setImageResource(R.drawable.programming);
                }
                else
                    checker.setImageResource(R.drawable.knockknock);
            }

            @Override
            public void onFailure(Call<Joke> call, Throwable t) {
                Log.v("Api : ", "Failed");
            }
        });

    }
}
