package fanfic.sharing.jpmg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/article")
@Controller
public class ArticleController {
    @GetMapping("/list")
    public String articleListPage() {
        return "article/list";
    }
}
