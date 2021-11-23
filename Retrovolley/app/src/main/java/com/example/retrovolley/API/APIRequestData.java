package com.example.retrovolley.API;

import com.example.retrovolley.Model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIRequestData {
    //ambil data nama file kita
    @GET("retrieve.php")
    Call<ResponseModel> ardRetrieveData();

    //Menambah data

    //menambah data
    @FormUrlEncoded
    @POST("tambah.php")
    Call<ResponseModel> ardCreateData(
            @Field("user_fullname") String nama,
            @Field("user_email") String email,
            @Field("user_password") String password
    );
}
