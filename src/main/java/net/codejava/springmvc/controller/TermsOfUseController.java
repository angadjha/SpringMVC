package net.codejava.springmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TermsOfUseController {

    private static final Logger logger = LoggerFactory.getLogger(TermsOfUseController.class);

    @RequestMapping(value = "/terms.do", method = RequestMethod.GET)
    public String service(Model model) {
        logger.debug(" terms success");
        System.out.println("terms page is calling");
        return "terms/terms";

    }
}
