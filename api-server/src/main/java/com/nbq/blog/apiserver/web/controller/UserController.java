package com.nbq.blog.apiserver.web.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Ben
 * @since 2018-09-29
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

}

