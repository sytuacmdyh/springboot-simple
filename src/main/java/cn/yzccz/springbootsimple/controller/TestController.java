package cn.yzccz.springbootsimple.controller;

import cn.yzccz.springbootsimple.entity.User;
import cn.yzccz.springbootsimple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    UserService userService;

    @GetMapping("getUser")
    User getUser(@RequestParam Long id) {
        return userService.getById(id);
    }

    @GetMapping("getUserList")
    List<User> getUsers() {
        return userService.list();
    }
}
