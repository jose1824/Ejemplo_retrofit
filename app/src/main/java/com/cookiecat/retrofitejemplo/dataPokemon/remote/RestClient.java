package com.cookiecat.retrofitejemplo.dataPokemon.remote;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by jesus on 16/12/17.
 */

public interface RestClient {
    @GET("pokemon")
    Call<PokemonFeed> getData();

}
