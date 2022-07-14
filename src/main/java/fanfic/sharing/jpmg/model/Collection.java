package fanfic.sharing.jpmg.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Collection {
    @Id
    private String id;

    private String title;
    private String authorId;

    private String postDate;
    private String updateDate;

    // A list of article id;
    private List<String> articleIds;
}