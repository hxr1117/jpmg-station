package fanfic.sharing.jpmg.model;

import org.springframework.data.annotation.Id;

public class Log {
    @Id
    private String id;

    private String event;
}
