package news.world.live.CricketApiLive.modelCricket;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ObjectDesignClass {

    @SerializedName("data")
    @Expose
    private List<TeamClass> data = null;

    /**
     * No args constructor for use in serialization
     */
    public ObjectDesignClass() {
    }

    /**
     * @param data
     */
    public ObjectDesignClass(List<TeamClass> data) {
        super();
        this.data = data;
    }

    public List<TeamClass> getData() {
        return data;
    }

    public void setData(List<TeamClass> data) {
        this.data = data;
    }

}
