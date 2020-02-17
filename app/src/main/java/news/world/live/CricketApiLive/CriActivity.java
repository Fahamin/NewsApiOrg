package news.world.live.CricketApiLive;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import news.world.live.CricketApiLive.modelCricket.ObjectDesignClass;
import news.world.live.CricketApiLive.modelCricket.TeamClass;
import news.world.live.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricket_api);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://cricket.sportmonks.com/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CricketApi api = retrofit.create(CricketApi.class);

        Call<TeamClass> call = api.getAllDATA(2,"GxsdxdRTG9mAMsXwmXk8Gysv7zrRK7amqaSHN6OcG914pUlpoP1mshMeconz");


        call.enqueue(new Callback<TeamClass>() {
            @Override
            public void onResponse(Call<TeamClass> call, Response<TeamClass> response) {

                if(response.isSuccessful())
                {
                    String name = response.body().getName();
                    int id =  response.body().getCountry_id();
                    Toast.makeText(CriActivity.this, name, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<TeamClass> call, Throwable t) {
                Toast.makeText(CriActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
