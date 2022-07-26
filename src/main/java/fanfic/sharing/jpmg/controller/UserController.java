package fanfic.sharing.jpmg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class UserController {
    @GetMapping("/postArticle")
    public String postArticlePage() {
        return "user/postArticle";
    }
}
