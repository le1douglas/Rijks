package le1.rijks.domain.entities;

import android.net.Uri;
import android.text.TextUtils;

import le1.rijks.data.JSONItemResponse.ArtObject;
import le1.rijks.data.JSONItemResponse.Dimension;
import le1.rijks.data.JSONItemResponse.JSONItemResponse;
import le1.rijks.data.JSONItemResponse.PrincipalMaker;

/**
 * Created by leone on 14/01/18.
 */

public class WorkOfArt {
    private String title;
    private String author;
    private String description;
    private String date;
    private String medium;
    private Integer width;
    private Integer height;
    private Integer depth;
    private Uri image;

    public WorkOfArt(JSONItemResponse jsonItemResponse) {
        ArtObject artObject = jsonItemResponse.getArtObject();
        title = artObject.getTitle();
        for (PrincipalMaker pm : artObject.getPrincipalMakers()) {
            if (TextUtils.isEmpty(author)) author = pm.getName();
            else author = author + ", " + pm.getName();
        }
        description = artObject.getPlaqueDescriptionEnglish();
        date = artObject.getDating().getPresentingDate();
        medium = artObject.getPhysicalMedium();
        for (Dimension dim : artObject.getDimensions()) {
            switch (dim.getType()) {
                case "height":
                    if (height==null)
                    height = Integer.valueOf(dim.getValue());
                    break;
                case "width":
                    if (width==null)
                    width = Integer.valueOf(dim.getValue());
                    break;
                case "depth":
                    if (depth==null)
                    depth = Integer.valueOf(dim.getValue());
                    break;
            }
        }
        image = Uri.parse(artObject.getWebImage().getUrl());
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getMedium() {
        return medium;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getDepth() {
        return depth;
    }

    public Uri getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "WorkOfArt{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", medium='" + medium + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", image=" + image +
                '}';
    }
}
