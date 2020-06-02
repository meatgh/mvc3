package technicalblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import technicalblog.model.Post;
import technicalblog.service.PostService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("posts")
    public String getUserPosts(Model model) throws SQLException {

        //MC1 - ArrayList<Post> posts = postService.getOnePost(); - changed the return type from String to a Post
        //MC2 - ArrayList<Post> posts = postService.getOnePost(); - this line was changed
        // MC3 - ArrayList<Post> posts = new ArrayList<>(); commented this out in create post video of the model - to debug the error of not getting a page with id = 3
        // ArrayList<Post> posts = postService.getOnePost();
        List<Post> posts = postService.getAllPosts();
//      //MC4  Post latestPost = postService.getOnePost(); commented this out in create post video of the model - to debug the error of not getting a page with id = 3
//        posts.add(latestPost);


        model.addAttribute("posts", posts);
        return "posts";
    }

    @RequestMapping("/posts/newpost")
    public String newPost() {
        return "posts/create";
    }

    @RequestMapping(value = "/posts/create", method = RequestMethod.POST)
    public String createPost(Post newPost){
        postService.createPost(newPost);
        return "redirect/posts";
    }

}
//the attribute key is posts, timestamp 6:06 in the video, login feature-3. This is picked up by the posts.html from the model basis this attribute key
