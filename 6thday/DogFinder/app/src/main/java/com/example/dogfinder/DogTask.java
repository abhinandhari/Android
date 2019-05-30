package com.example.dogfinder;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DogTask extends AsyncTask<String, Void, JSONObject> {
    @Override
    protected JSONObject doInBackground(String... strings) {    // ... = []
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https").authority("dog.ceo")
                .appendPath("api")              //the site from where u mukkalfying
                .appendPath("breed")
                .appendPath(strings[0])
                .appendPath("images")
                .appendPath("random")
                .appendPath("2");
        String URL = builder.build().toString();//constants are in caps
        Log.v("URL :",URL);
        HttpURLConnection connection = null;
        InputStream inputStream = null;
        try {
            java.net.URL url = new URL(URL);
            connection = (HttpURLConnection) url.openConnection();
            inputStream = connection.getInputStream();
            StringBuffer buffer = new StringBuffer();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while((line = reader.readLine())!=null){
                buffer.append(line+"\n");
            }
            JSONObject object = new JSONObject(buffer.toString());
            return object;
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                inputStream.close();
                connection.disconnect();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }
}
