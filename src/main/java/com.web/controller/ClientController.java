package com.web.controller;

import com.web.entity.ClientEntity;
import com.web.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cnhhdn on 2016/6/27.
 */
@Controller
@RequestMapping("/admin/client")
public class ClientController {
    @Autowired
    ClientService service;
    @RequestMapping("")
    public String getAllClient(ModelMap modelMap){
        List clientList=service.getAll();
        modelMap.addAttribute("clientList",clientList);
        return "client";
    }
    @RequestMapping("/detail")
    public String getClient(@RequestParam("id")int clientId, ModelMap modelMap){
        ClientEntity client=service.getbyId(clientId);
        Map<String ,String> typeMap=new HashMap<String ,String>();
        typeMap.put("家庭用户","家庭用户");
        typeMap.put("单位用户","单位用户");
        typeMap.put("签约用户","签约用户");
        typeMap.put("代理商","代理商");
        modelMap.addAttribute("client",client);
        modelMap.addAttribute("typeMap",typeMap);
        return "clientDetail";
    }
    @RequestMapping(value = "/addClient")
    public String addClient(ModelMap modelMap){
        Map<String ,String> typeMap=new HashMap<String, String>();
        typeMap.put("0","家庭用户");
        typeMap.put("1","单位用户");
        typeMap.put("2","签约用户");
        typeMap.put("3","代理商");
        modelMap.addAttribute("typeMap",typeMap);
        return "addClient";
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update( ClientEntity client, RedirectAttributesModelMap modelMap){
        service.update(client);
        modelMap.addFlashAttribute("msg","更新成功");
        return "redirect:/admin/client/detail?id="+client.getClientId();
    }
    @RequestMapping(value = "/delete")
    public String deleteClient( @RequestParam("id") int clientId, RedirectAttributesModelMap modelMap){
        service.delete(clientId);
        modelMap.addFlashAttribute("msg","删除成功");
        return "redirect:/admin/client";
    }
    @InitBinder
    public void initBinder(WebDataBinder binder){
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class,new CustomDateEditor(dateFormat,true));
    }
    @RequestMapping(value = "/addClient1",method = RequestMethod.POST)
    public String addClient1( ClientEntity client, RedirectAttributesModelMap modelMap){
        service.add(client);
        modelMap.addFlashAttribute("msg","更新成功");
        return "redirect:/admin/client/detail?id="+client.getClientId();
    }
}
