package com.zhang.springbootdemo.controller;

import com.zhang.springbootdemo.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class MyController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }


    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(@RequestParam String params) {
        System.out.println(params);
        return "hello " + params;
    }

    @GetMapping("/searchall")
    public String searchAll(@RequestParam Map map) {// 这个也可以使用bean对象
        System.out.println(map);
        return map.toString();
    }

    @GetMapping("/search/{path}")
    public String path(@PathVariable String path) {
        System.out.println(path);
        return path;
    }


    @PostMapping("/find")
    public String find(@RequestBody String userId) {
        System.out.println(userId);
        return userId;
    }

    @PostMapping("/adduser")
    public String addUser(@RequestBody User user) {
        System.out.println(user);
        return "Success";
    }

    @PostMapping("/addmap")
    public String addUser1(@RequestBody Map map) {
        System.out.println(map);
        return map.toString();
    }

    @ResponseBody
    @PostMapping("/finduser")
    public User findUser(@RequestBody User user) {
        System.out.println(user);
        return user;
    }


}
