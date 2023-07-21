package dev.kbekind.springsecuritylamdadsl.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {


        @GetMapping("/")
        public String baseUrlGetMapping(Model model) {

            return homeGetMapping(model);
        }

    @GetMapping("/home")
    public String homeGetMapping(Model model) {

        return "home";
    }
    }