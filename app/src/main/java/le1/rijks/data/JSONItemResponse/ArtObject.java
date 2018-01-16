package le1.rijks.data.JSONItemResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ArtObject {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("objectNumber")
    @Expose
    private String objectNumber;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("webImage")
    @Expose
    private WebImage webImage;
    @SerializedName("colors")
    @Expose
    private List<String> colors = null;
    @SerializedName("objectTypes")
    @Expose
    private List<String> objectTypes = null;
    @SerializedName("principalMakers")
    @Expose
    private List<PrincipalMaker> principalMakers = null;
    @SerializedName("plaqueDescriptionDutch")
    @Expose
    private String plaqueDescriptionDutch;
    @SerializedName("plaqueDescriptionEnglish")
    @Expose
    private String plaqueDescriptionEnglish;
    @SerializedName("dating")
    @Expose
    private Dating dating;
    @SerializedName("dimensions")
    @Expose
    private List<Dimension> dimensions = null;
    @SerializedName("physicalMedium")
    @Expose
    private String physicalMedium;

    public String getId() {
        return id;
    }

    public String getObjectNumber() {
        return objectNumber;
    }

    public WebImage getWebImage() {
        return webImage;
    }

    public List<String> getColors() {
        return colors;
    }

    public List<String> getObjectTypes() {
        return objectTypes;
    }

    public List<PrincipalMaker> getPrincipalMakers() {
        return principalMakers;
    }

    public String getPlaqueDescriptionDutch() {
        return plaqueDescriptionDutch;
    }

    public String getPlaqueDescriptionEnglish() {
        return plaqueDescriptionEnglish;
    }

    public Dating getDating() {
        return dating;
    }

    public List<Dimension> getDimensions() {
        return dimensions;
    }

    public String getPhysicalMedium() {
        return physicalMedium;
    }

    public String getTitle() {
        return title;
    }

}