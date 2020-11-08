package com.example.decisions;

import android.os.AsyncTask;

import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

////public class FetchData extends AsyncTask<Void, Void, Void> {
//
//    @Override
//    protected Void doInBackgroud(Void...voids) {
//        try {
//            URL url = new URL("https://api.themoviedb.org/3/discover/movie?api_key=283011eaf99b080922d9984d75e9b8e4&language=en-US&include_adult=false&include_video=false&with_genres=&certification_country=US&certification=&vote_average.gte=&sort_by=popularity.desc");
//
//
//
//            URLConnection URLConnection = url.openConnection();
//            InputStream inputStream = URLConnection.getInputStream();
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//            String line = "";
//            while(line!= null) {
//                line = bufferedReader.readLine();
//                data = data + line;
//            }
//
//            JSONArray JA = new JSONArray(data);
//
//
//
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//
//    @Override
//    protected void onPostExecute(Void aVoid) {
//        super.onPostExecute(aVoid);
//    }
//
//
//}
