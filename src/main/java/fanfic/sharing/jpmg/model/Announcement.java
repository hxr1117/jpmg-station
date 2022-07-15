package fanfic.sharing.jpmg.model;

import org.springframework.data.annotation.Id;

public class Announcement {
    @Id
    private String id;

    private String title;
    private String content;
    private String postDate;
}
