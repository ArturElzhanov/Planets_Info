package elzhanov.planets_info;

/**
 * Created by User on 26.08.2016.
 */
public class Planets {
    private int photo;
    private String name;
    private String info;


    public Planets(int photo, String name, String info) {
        this.photo = photo;
        this.name = name;
        this.info = info;

    }
    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
