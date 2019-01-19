package demo.dankim.com.mvvmrecyclerviewwithdatabind.models;

/**
 * Created by Dan Kim on 2019-01-18
 */
public class News {

    private String title, description;

    public News(String title, String description) {

        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
