package com.example.demomybaitis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {
  @RequestMapping("/")
  public ModelAndView index(){
    Map map = new HashMap();

    return new ModelAndView("index","test","testvalue");
  }

}
