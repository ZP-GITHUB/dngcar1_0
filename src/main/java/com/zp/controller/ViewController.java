package com.zp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by ZP on 2019/5/2.
 */

@Controller
public class ViewController {

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("View/{view}")
    public String toView (@PathVariable("view") String view){
        return view;
    }
}
