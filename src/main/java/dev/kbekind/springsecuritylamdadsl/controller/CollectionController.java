package dev.kbekind.springsecuritylamdadsl.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/collection")
public class CollectionController {


    @GetMapping("/")
    public String baseUrlCollectionGetMapping(Model model) {

        return collectionGetMapping(model);
    }

    @GetMapping("/collection")
    public String collectionGetMapping(Model model) {

        return "collection/collection";
    }
}
