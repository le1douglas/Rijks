package le1.rijks.data.JSONItemResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dimension {

    @SerializedName("unit")
    @Expose
    private String unit;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("value")
    @Expose
    private String value;

    public String getUnit() {
        return unit;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

}