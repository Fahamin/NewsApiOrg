package news.world.live.CricketApiLive.modelCricket;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ArrayDesignClass {
    private String fullname;
    private String dateofbirth;
    private String gender;
    private PositionClass position;

    public PositionClass getPosition() {
        return position;
    }

    public ArrayDesignClass(String fullname, String dateofbirth, String gender, PositionClass position) {
        this.fullname = fullname;
        this.dateofbirth = dateofbirth;
        this.gender = gender;
        this.position = position;
    }

    public PositionClass getPositionClass() {
        return position;
    }

    public void setPosition(PositionClass position) {
        this.position = position;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}