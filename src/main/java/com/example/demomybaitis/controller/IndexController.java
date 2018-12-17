package com.example.demomybaitis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller

public class IndexController {
  @RequestMapping("/index")
  @ResponseBody
  public ModelAndView index(){

    return new ModelAndView("index");
  }
  @RequestMapping(value = "/{module}", method = RequestMethod.GET)
  public String module(HttpSession session, ModelMap model, @PathVariable(value = "module") String module) {
    model.put("module", module);


    return module;
  }

  @RequestMapping(value = "/{view}.html", method = RequestMethod.GET)
  @ResponseBody
  public ModelAndView view(HttpSession session,
       @PathVariable(value = "view") String view){
    ModelAndView viewModel = new ModelAndView("/" + view);
    viewModel.setViewName( "/" + view);

    return viewModel;
  }

  @RequestMapping(value = "/{module}/{view}.html", method = RequestMethod.GET)
  @ResponseBody
  public ModelAndView moduleAndView1(HttpSession session, ModelMap model
      , @PathVariable(value = "module") String module
      , @PathVariable(value = "view") String view) {

    ModelAndView viewModel = new ModelAndView(module + "/" + view);
    viewModel.setViewName(module + "/" + view);

    model.put("module", module);
    model.put("view", view);

    return viewModel;
  }

}
