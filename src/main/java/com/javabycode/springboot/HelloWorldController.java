package com.javabycode.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
	
    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        
        String message="You just create Spring Boot Thymeleaf Example successfully";
        model.addAttribute("name", name);
        model.addAttribute("message", message);
        
        return "hello";
    }
}
