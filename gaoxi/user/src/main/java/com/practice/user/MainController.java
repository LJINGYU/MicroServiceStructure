package com.practice.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 */
@RestController
@RequestMapping("/index")
public class MainController {
    @RequestMapping("/hello")
    @ResponseBody
    public String index(){
        return "Hello World!";
    }
}
