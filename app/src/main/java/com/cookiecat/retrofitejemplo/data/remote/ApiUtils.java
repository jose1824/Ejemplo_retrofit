package com.cookiecat.retrofitejemplo.data.remote;

/**
 * Created by jesus on 16/12/17.
 */

public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "http://jsonplaceholder.typicode.com/";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
