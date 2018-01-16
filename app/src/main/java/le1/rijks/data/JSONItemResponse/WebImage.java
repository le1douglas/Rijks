package le1.rijks.data.JSONItemResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WebImage {
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("url")
    @Expose
    private String url;

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public String getUrl() {
        return url;
    }

}