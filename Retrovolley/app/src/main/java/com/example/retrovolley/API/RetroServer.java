package com.example.retrovolley.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroServer {
    //    alamat server kita
    //10.0.2.2 untuk nox
    //10.0.3.2 untuk memu play
    private static final String baseUrl = "http://10.0.2.2/ngilmu.co/";
    private static Retrofit retro;

    public static Retrofit konekRetrofit(){

        if(retro==null){
            retro = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retro;
    }
}
