package me.spring.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Danh dau day la mot Controller, noi tiep nhan cac request tu user
@Controller
public class WebController {
    @GetMapping("/") //Neu user request toi dia chi  "/"
    public String index() {
        return "index"; //thi tra ve file index.html
    }

    @GetMapping("/about") //Neu user request toi dia chi  "/about"
    public String about() {
        return "about"; //thi tra ve file about.html
    }

    @GetMapping("/hello")
    public String hello(
            //Request param "name" se duoc gan gia tri vao bien String
            @RequestParam(name = "name", required = false, defaultValue = "") String name,
            //Model la mot object cua Spring Boot, duoc gan vao trong moi request
            Model model
    ) {
        model.addAttribute("name", name);

        return  "hello"; //tra ve file hello.html cung voi thong tin trong object Model
    }
}
