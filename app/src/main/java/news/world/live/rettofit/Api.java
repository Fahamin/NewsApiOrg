package news.world.live.rettofit;

import news.world.live.rettofit.model.NewsDetails;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface Api {

    @GET
    Call<NewsDetails>getNews(@Url String url);
}
