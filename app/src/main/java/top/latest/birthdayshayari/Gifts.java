package top.latest.birthdayshayari;

public class Gifts {
    String image_url;
    String details;
    String link;



    //Default constucter is required as we are using parameterised constructer
    Gifts()
    {

    }

    public Gifts( String image_url,String details, String link) {
        this.image_url = image_url;
        this.details = details;
        this.link = link;

    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
