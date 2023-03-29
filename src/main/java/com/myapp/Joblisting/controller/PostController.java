
package com.myapp.Joblisting.controller;

import com.myapp.Joblisting.repository.Postrepository;
import com.myapp.Joblisting.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.io.IOException;
import java.util.Optional;

@RestController
public class PostController {
    @Autowired
    Postrepository repo;
    @RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException
    {
        response.sendRedirect("/swagger-ui.html");
    }
    @GetMapping("/posts")

    public List<Post> getAllPosts()
    {
        return repo.findAll();
    }
    @GetMapping("/posts/{text}")

    public Optional<Post> search(@PathVariable String text)
    {
        return repo.findById(text);
    }
    @PostMapping("/post")

    public Post addPost(@RequestBody Post post)
    {
         return repo.save(post);
    }

}
