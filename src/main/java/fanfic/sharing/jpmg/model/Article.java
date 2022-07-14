package fanfic.sharing.jpmg.model;

import org.springframework.data.annotation.Id;

public class Article {
    @Id
    private String id;

    private String title;
    private String content;
    private Boolean adult;
    private String authorId;
    private int likes;
    private String summary;

    public Article(String id, String title, String content, Boolean adult, String authorId, int likes, String summary) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.adult = adult;
        this.authorId = authorId;
        this.likes = likes;
        this.summary = summary;
    }
}
