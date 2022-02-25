package pl.comarch.szkolenia.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyFirstController {

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main() {
        System.out.println("Odpaliło się !!!!");
        return "main";
    }

}
