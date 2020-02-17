package news.world.live.CricketApiLive;

import java.util.List;

import news.world.live.CricketApiLive.modelCricket.ObjectDesignClass;
import news.world.live.CricketApiLive.modelCricket.TeamClass;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CricketApi {

    String url = "https://cricket.sportmonks.com/api/v1/teams?api_token=GxsdxdRTG9mAMsXwmXk8Gysv7zrRK7amqaSHN6OcG914pUlpoP1mshMeconz";

    @GET("teams/{id}")
    Call<TeamClass> getAllDATA(@Path("id") int id, @Query("api_token") String token);
}
