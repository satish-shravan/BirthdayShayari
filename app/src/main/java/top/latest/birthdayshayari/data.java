package top.latest.birthdayshayari;

public class data {

    private String data;
    private int id;

    public data(int id,String data) {
        this.data=data;
        this.id=id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
}
