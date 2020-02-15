package news.world.live.vollyTest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import news.world.live.R;

public class NewsVollyTest extends AppCompatActivity {

    RequestQueue requestQueue;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_volly_test);

        String api = "https://newsapi.org/v2/everything?q=bitcoin&from=2020-01-15&sortBy=publishedAt&apiKey=aa7bbd8a98e643ebb3b26ffa7598171a";

        textView = findViewById(R.id.textvollyID);


        requestQueue = Volley.newRequestQueue(this);

        JsonObjectRequest objectRequest = new JsonObjectRequest(Request.Method.GET, api, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                String result = " ";
                try {
                    JSONArray array = response.getJSONArray("articles");

                    for (int i = 0; i <array.length() ; i++) {
                        JSONObject object = array.getJSONObject(i);

                        String title = object.getString("title");
                        result += title + "\n\n";
                    }
                    textView.append(result);


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        },new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(NewsVollyTest.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });

        requestQueue.add(objectRequest);
    }





}
