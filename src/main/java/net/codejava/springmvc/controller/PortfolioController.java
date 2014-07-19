package net.codejava.springmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PortfolioController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/portfolio.do", method = RequestMethod.GET)
    public String portfolio(Model model) {
        System.out.println("portfolio page is calling");
        return "portfolio/portfolio";

    }
}
