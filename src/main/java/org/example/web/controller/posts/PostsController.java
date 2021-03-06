package org.example.web.controller.posts;

import lombok.RequiredArgsConstructor;
import org.example.service.posts.PostsService;
import org.example.web.dto.posts.PostsResponseDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class PostsController {

    private final PostsService postsService;

    @GetMapping("/posts")
    public String index(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());
        return "tables/posts/index";
    }

    @GetMapping("/posts/save")
    public String postsSave(){ return "tables/posts/posts-save";}

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model){
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post",dto);

        return "tables/posts/posts-update";
    }
}
