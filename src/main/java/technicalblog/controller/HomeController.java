package technicalblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;
import technicalblog.service.PostService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private PostService postService;

       @RequestMapping("/")
    public String getAllPosts(Model model) throws SQLException {

           List<Post> posts = postService.getAllPosts();
        //ArrayList<Post> posts = postService.getAllPosts(); - changed from AL to List

        model.addAttribute("posts", posts);

        return "index";

    }
}
