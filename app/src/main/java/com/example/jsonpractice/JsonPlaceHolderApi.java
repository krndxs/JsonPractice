package com.example.jsonpractice;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JsonPlaceHolderApi {

    @GET("users/{returnedUser}/posts")
    Call<List<Post>> getPosts(@Path("returnedUser") String StoreUserId);

}


