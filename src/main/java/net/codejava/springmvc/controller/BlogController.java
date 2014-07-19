package net.codejava.springmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BlogController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/blog.do", method = RequestMethod.GET)
    public String blog(Model model) {
        System.out.println("blog page calling");
        return "blog/blog";

    }

    @RequestMapping(value = "/blog-item.do", method = RequestMethod.GET)
    public String blogsingle(Model model) {
        System.out.println("blog single page calling");
        return "blog/blog-item";

    }
}
