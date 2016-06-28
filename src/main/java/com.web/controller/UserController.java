package com.web.controller;

import com.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by cnhhdn on 2016/6/27.
 */
@Controller
public class UserController  {
    @Autowired
    UserService service;
@RequestMapping(value="/admin",method = RequestMethod.GET)
    public String login(@RequestParam("msg") String msg, ModelMap modelMap){
    modelMap.addAttribute("msg",msg);
    return "admin";
}
}
