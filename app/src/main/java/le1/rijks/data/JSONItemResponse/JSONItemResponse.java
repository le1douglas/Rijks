package le1.rijks.data.JSONItemResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JSONItemResponse {

    @SerializedName("elapsedMilliseconds")
    @Expose
    private Integer elapsedMilliseconds;
    @SerializedName("artObject")
    @Expose
    private ArtObject artObject;

    public Integer getElapsedMilliseconds() {
        return elapsedMilliseconds;
    }

    public ArtObject getArtObject() {
        return artObject;
    }

}