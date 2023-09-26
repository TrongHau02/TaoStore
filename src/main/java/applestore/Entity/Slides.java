package applestore.Entity;

public class Slides {
    public int slideID;
    public String slideName;
    public String image;
    public String description;

    public Slides() {
    }

    public Slides(String slideName, String image, String description) {
        this.slideName = slideName;
        this.image = image;
        this.description = description;
    }

    public int getSlideID() {
        return slideID;
    }

    public void setSlideID(int slideID) {
        this.slideID = slideID;
    }

    public String getSlideName() {
        return slideName;
    }

    public void setSlideName(String slideName) {
        this.slideName = slideName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
