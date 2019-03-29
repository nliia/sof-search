package com.nurullina.controller;

import com.nurullina.dto.FrontQuestion;
import com.nurullina.service.StackExchangeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.stream.Collectors;

/**
 * @author lnurullina
 */
@Controller
@RequestMapping("/")
public class MainController {
    @Autowired
    private StackExchangeService stackExchangeService;

    @Autowired
    private Logger logger;

    @RequestMapping("/")
    public String main() {
        return "main";
    }

    @RequestMapping("/search")
    public String getQuestions(@RequestParam("query") String query, Model model) {
        logger.debug("Got request for search, query:" + query);
        model.addAttribute("questions", stackExchangeService.getQuestions(query)
                .stream().map(FrontQuestion::new)
                .collect(Collectors.toList()));
        return "main";
    }
}
