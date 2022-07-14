package fanfic.sharing.jpmg.model;

import org.springframework.data.annotation.Id;

public class Bookmark {
    @Id
    private String id;

    private String userId;
    private String articleId;
    private String collectionId;
}
