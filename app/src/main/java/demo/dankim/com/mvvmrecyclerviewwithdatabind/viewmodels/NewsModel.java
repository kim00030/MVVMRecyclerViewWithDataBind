package demo.dankim.com.mvvmrecyclerviewwithdatabind.viewmodels;

import demo.dankim.com.mvvmrecyclerviewwithdatabind.models.News;

/**
 * Created by Dan Kim on 2019-01-18
 */
public class NewsModel {

    public String title, desc;

    public NewsModel() {
    }

    public NewsModel(News news) {

        this.title = news.getTitle();
        this.desc = news.getDescription();
    }
}
