package com.user.controller;

import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.user.entity.User;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId){
        User user = this.userService.getuser(userId) ;

        List contacts = this.restTemplate.getForObject("http://contact-service/contact/user/"+userId, List.class) ;

        user.setContacts(contacts);

        return user;
    }
}
