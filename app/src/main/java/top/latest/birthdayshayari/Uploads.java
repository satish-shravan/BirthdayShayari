package top.latest.birthdayshayari;

public class Uploads{

    public String name;
    public String url;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public Uploads() {
    }

    public Uploads(String name, String url) {
        this.name = name;
        this.url= url;
    }

    public String getName() {
        return name ;
    }

    public String getUrl() {
        return url;
    }
}
