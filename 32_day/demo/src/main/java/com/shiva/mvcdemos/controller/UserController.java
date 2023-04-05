package com.shiva.mvcdemos.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shiva.mvcdemos.entity.User;

@RequestMapping("/user")
@Controller
public class UserController {
    private final List<User> users = Arrays.asList(
            new User(11, "abc", "87654", "abc@gmail.com"),
            new User(12, "wef", "8376", "gf@gmail.com"),
            new User(13, "lmn", "43232344", "vv@ty.com"),
            new User(14, "xyz", "242536456", "mb@wt.com"),
            new User(15, "tuv", "16534126", "dd@ss.com"));

    @GetMapping("/one/{id}")
    public String findUser(@PathVariable Integer id, Model model) {
        User user = users.stream().filter(us -> Objects.equals(us.getId(), id))
                .collect(Collectors.toList())
                .get(0);
        model.addAttribute("usNm", user.getName());
        return "user";
    }

    @PostMapping("/create") // http://localhost:8080/user/create
    public ModelAndView createNewUser(@ModelAttribute("user") User user) {

        ModelAndView mv = new ModelAndView("success");
        mv.addObject("usNm", user.getName());
        mv.addObject("mob", user.getMobile());
        mv.addObject("eml", user.getEmail());

        return mv;
    }

    @GetMapping("/show")
    public String showRegForm() {
        return "createuser";
    }

}
