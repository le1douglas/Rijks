package le1.rijks.data.JSONItemResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dating {

    @SerializedName("presentingDate")
    @Expose
    private String presentingDate;
    @SerializedName("sortingDate")
    @Expose
    private Integer sortingDate;
    @SerializedName("period")
    @Expose
    private Integer period;

    public String getPresentingDate() {
        return presentingDate;
    }

    public Integer getSortingDate() {
        return sortingDate;
    }

    public Integer getPeriod() {
        return period;
    }

}