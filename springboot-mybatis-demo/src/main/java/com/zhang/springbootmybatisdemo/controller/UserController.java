package com.zhang.springbootmybatisdemo.controller;

import com.zhang.springbootmybatisdemo.domain.User;
import com.zhang.springbootmybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @apiDefine spring boot demo
 * spring boot demo 接口
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @api {post} /user/add   添加User的接口
     * @apiName 添加用户
     * @apiGroup user
     * @apiDescription 添加用户的接口
     * @apiParam userId 用户id
     * @apiParam username 用户名
     * @apiParam password 用户名密码
     * @apiParamExample {json}
     * Request-Example 1:
     * {
     *      "userId":"1001",
     *      "username":"caocao",
     *      "password":"123456"
     * }
     * @apiSuccess 1
     */
    @PostMapping("/add")
    public int add(@RequestBody User user) {
        return userService.addUser(user);
    }

    /**
     * @api {post} /user/search   查询用户的接口
     * @apiName 通过id查询用户
     * @apiGroup user
     * @apiDescription 通过id查询用户的接口
     * @apiParam userId 用户id
     * @apiParamExample {json}
     * Request-Example 1:
     * {"userId":"1001"}
     * @apiSuccess {String} userId 用户id
     * @apiSuccess {String} username 用户名
     * @apiSuccess {String} password 用户名密码
     * @apiSuccessExample {json} Success-Response:
     * {
     *      "userId": "1001",
     *      "username": "caocoa",
     *      "password":"123456"
     * }
     */
    @ResponseBody
    @PostMapping("/search")
    public User searchById(@RequestBody User user) {
        return userService.searchById(user.getUserId());
    }


    /**
     * @api {post} /user/searchall   查询所有用户的接口
     * @apiName 查询所有用户
     * @apiGroup user
     * @apiDescription 查询所有用户的接口
     * @apiSuccess {String} userId 用户id
     * @apiSuccess {String} username 用户名
     * @apiSuccess {String} password 用户名密码
     * @apiSuccessExample {json} Success-Response:
     * [
     *  {
     *    "userId": "1001",
     *    "username": "caocao",
     *    "password": "123456"
     *  },
     *  {
     *    "userId": "1002",
     *    "username": "liubei",
     *    "password": "123456"
     *  }
     * ]
     */
    @ResponseBody
    @PostMapping("/searchall")
    public List<User> searchAll() {
        return userService.searchAll();
    }

}
