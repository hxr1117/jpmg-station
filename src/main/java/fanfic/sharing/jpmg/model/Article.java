package fanfic.sharing.jpmg.model;

import org.springframework.data.annotation.Id;

public class Article {
    @Id
    private String id;

    private String title;
    private String content;
    private Boolean adult;
    private String authorId;
    private int likes = 0;
    private String summary;

    private String postDate;
    private String updateDate;

    public Article(String id, String title, String content, Boolean adult, String authorId, String summary, String postDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.adult = adult;
        this.authorId = authorId;
        this.summary = summary;
        this.postDate = postDate;
    }
}
