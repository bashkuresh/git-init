package com.marketplace.marketplaceapp.controller;

import com.marketplace.marketplaceapp.entitiy.User;
import com.marketplace.marketplaceapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, path = "/user/create")
    public String createUserGet(Model model) {
        model.addAttribute("user", new User());
        return "createUser";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/user/create")
    public String createUserPost(User user) {
        userService.save(user);
        return "redirect:/user/list";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/user/list")
    public String userList(Model model) {
        Iterable<User> userList = userService.getUserList();
        model.addAttribute("userList", userList);
        return "userList";
    }

    @GetMapping("/get-user/{id}")
    public String getUserByID(Model model, @PathVariable int  id){
        User user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "user";
    }


}
