package net.codejava.springmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class PrivacyController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/privacy.do", method = RequestMethod.GET)
    public String privacy(Model model) {
        System.out.println("privacy page is calling");
        return "privacy/privacy";

    }

    @RequestMapping(value = "/404.do", method = RequestMethod.GET)
    public String use404(Model model) {
        System.out.println("privacy page is calling");
        return "error/404";

    }
}
