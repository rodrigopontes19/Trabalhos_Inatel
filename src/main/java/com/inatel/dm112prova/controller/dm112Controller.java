package com.inatel.dm112prova.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class dm112Controller {
    @GetMapping("/lista")
    public ModelAndView getList(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
}
