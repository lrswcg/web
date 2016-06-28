package com.web.controller;

import com.web.entity.ClientEntity;
import com.web.service.ClientService;
import com.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by cnhhdn on 2016/6/24.
 */
@Controller
public class MainController {
    @Autowired
    ClientService service;
    @Autowired
    UserService userService;
    @RequestMapping(value = "/main")
    public String main(Integer clientId, @DateTimeFormat(pattern = "yyyy-MM-dd") Date addTime, ModelMap modelMap){
        ClientEntity clientEntity= service.getbyId(10000);
        System.out.println(clientId+""+addTime);
        System.out.println(clientEntity.getIdCard());
        modelMap.addAttribute("clientInfo",clientEntity);
        return "main";
    }
    @RequestMapping("/getClient")
    public String getClient(HttpServletRequest request, Model model){
        int clientId=Integer.parseInt(request.getParameter("id"));
        String client=request.getParameter("client");
        model.addAttribute("hello",""+clientId);
        model.addAttribute("client",client);
        return "main";
    }
    @RequestMapping(value = "/addClient",method = RequestMethod.GET)
    public String addClient(int clientId, @DateTimeFormat(pattern = "yyyy-MM-dd") Date addTime,String idCard,ModelMap modelMap){
        ClientEntity clientEntity=new ClientEntity();
        clientEntity.setAddTime(addTime);
        clientEntity.setIdCard(idCard);
        clientEntity.setClientId(clientId);
        service.add(clientEntity);
        return "main";
    }
    @RequestMapping(value = "/addClient1",method = RequestMethod.POST)
    public String addClient1(@DateTimeFormat(pattern = "yyyy-MM-dd")@RequestParam("date") Date addTime,ClientEntity clientEntity, ModelMap modelMap){
        clientEntity.setAddTime(addTime);
        service.add(clientEntity);
        System.out.println(clientEntity.getIdCard());
        return "main";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String username, String password, ModelMap modelMap, HttpSession httpSession){
        if(userService.login(username, password)){
            httpSession.setAttribute("user", userService.getbyName(username));
            modelMap.addAttribute("msg","登录成功");
            return "redirect:"+userService.getbyName(username).getUserurl();
        }else{
            modelMap.addAttribute("msg","登录失败");
            return "main";
        }
    }
    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    public String logout(ModelMap modelMap, HttpSession httpSession){

        System.out.println(httpSession.getAttribute("user").toString());
        httpSession.removeAttribute("user");
        modelMap.addAttribute("msg","已退出");
        return "main";
    }
}
