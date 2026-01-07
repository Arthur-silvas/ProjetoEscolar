package br.com.projectSchool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageTest {
    @GetMapping("/Home")
    public String pageTest(){
        return "Home";
    }

}
