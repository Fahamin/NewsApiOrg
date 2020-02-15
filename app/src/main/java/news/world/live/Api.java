package news.world.live;

import java.util.List;

import news.world.live.model.NewsDetails;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface Api {

    @GET
    Call<NewsDetails>getNews(@Url String url);
}
