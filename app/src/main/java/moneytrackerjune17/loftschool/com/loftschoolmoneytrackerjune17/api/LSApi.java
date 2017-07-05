package moneytrackerjune17.loftschool.com.loftschoolmoneytrackerjune17.api;


import java.util.List;

import moneytrackerjune17.loftschool.com.loftschoolmoneytrackerjune17.Item;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by rfshakhmatov on 28.06.17.
 */

public interface LSApi {

    @Headers("Content-Type: application/json")
    @GET("items")
    Call<List<Item>> items(@Query("type") String type);

    @GET("auth")
    Call<AuthResult> auth(@Query("social_user_id") String socialUserId);
}