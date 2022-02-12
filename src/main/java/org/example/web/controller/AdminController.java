package org.example.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class AdminController {

    @GetMapping("/admin/index")
    public String index(Model model) //index(Model model, @LoginUser SessionUser user)
    {

//        if(user != null){
//            model.addAttribute("userName", user.getName());
//        }
        // model.addAttribute("posts", postsService.findAllDesc());
        return "admin/index";
    }
}
