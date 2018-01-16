package le1.rijks.data.JSONItemResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PrincipalMaker {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("placeOfBirth")
    @Expose
    private String placeOfBirth;
    @SerializedName("dateOfBirth")
    @Expose
    private String dateOfBirth;
    @SerializedName("dateOfDeath")
    @Expose
    private String dateOfDeath;
    @SerializedName("placeOfDeath")
    @Expose
    private String placeOfDeath;
    @SerializedName("roles")
    @Expose
    private List<String> roles = null;
    @SerializedName("nationality")
    @Expose
    private Object nationality;
    @SerializedName("biography")
    @Expose
    private Object biography;

    public String getName() {
        return name;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDateOfDeath() {
        return dateOfDeath;
    }

    public String getPlaceOfDeath() {
        return placeOfDeath;
    }

    public List<String> getRoles() {
        return roles;
    }

    public Object getNationality() {
        return nationality;
    }

    public Object getBiography() {
        return biography;
    }

}