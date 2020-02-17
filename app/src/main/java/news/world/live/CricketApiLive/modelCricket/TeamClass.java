package news.world.live.CricketApiLive.modelCricket;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TeamClass {

    private String name;
    private int country_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public TeamClass() {
    }

    public TeamClass(String name, int country_id) {
        this.name = name;
        this.country_id = country_id;
    }
}

