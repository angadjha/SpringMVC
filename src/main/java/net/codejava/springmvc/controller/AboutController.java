package net.codejava.springmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AboutController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/about-us.do", method = RequestMethod.GET)
    public String about(Model model) {
        System.out.println("about page calling");
        return "about/about-us";

    }

    @RequestMapping(value = "/faq.do", method = RequestMethod.GET)
    public String faq(Model model) {
        System.out.println("about page calling");
        return "faq/faq";

    }
}

