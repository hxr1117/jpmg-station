package fanfic.sharing.jpmg.model;

import org.springframework.data.annotation.Id;

public class Collection {
    @Id
    private String id;

    private String title;
    private String authorId;
    // A list of article id;
    // private List<String> articleIds;
}