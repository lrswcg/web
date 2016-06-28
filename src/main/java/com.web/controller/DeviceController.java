package com.web.controller;

import com.web.entity.DeviceEntity;
import com.web.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cnhhdn on 2016/6/28.
 */
@Controller
@RequestMapping("/admin/device")
public class DeviceController {
    @Autowired
    DeviceService service;
    @RequestMapping("")
    public String getAllDevice(ModelMap modelMap){
        List<DeviceEntity> list=service.getAll();
        modelMap.addAttribute("deviceList",list);
        return "device";
    }

    @RequestMapping("/detail")
    public String getDevice(@RequestParam("id")int repairId, ModelMap modelMap){
        DeviceEntity device=service.getbyId(repairId);
        Map<String ,String> typeMap=new HashMap<String ,String>();
        typeMap.put("家庭用户","家庭用户");
        typeMap.put("单位用户","单位用户");
        typeMap.put("签约用户","签约用户");
        typeMap.put("代理商","代理商");
        modelMap.addAttribute("device",device);
        modelMap.addAttribute("typeMap",typeMap);
        return "deviceDetail";
    }
    @RequestMapping(value = "/addDevice")
    public String addDevice(ModelMap modelMap){
        Map<String ,String> typeMap=new HashMap<String, String>();
        typeMap.put("0","家庭用户");
        typeMap.put("1","单位用户");
        typeMap.put("2","签约用户");
        typeMap.put("3","代理商");
        modelMap.addAttribute("typeMap",typeMap);
        return "addDevice";
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update( DeviceEntity device, RedirectAttributesModelMap modelMap){
        service.update(device);
        modelMap.addFlashAttribute("msg","更新成功");
        return "redirect:/admin/device/detail?id="+device.getRepairId();
    }
    @RequestMapping(value = "/delete")
    public String deleteClient( @RequestParam("id") int repairId, RedirectAttributesModelMap modelMap){
        service.delete(repairId);
        modelMap.addFlashAttribute("msg","删除成功");
        return "redirect:/admin/device";
    }
    @InitBinder
    public void initBinder(WebDataBinder binder){
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class,new CustomDateEditor(dateFormat,true));
    }
    @RequestMapping(value = "/addDevice1",method = RequestMethod.POST)
    public String addClient1( DeviceEntity device, RedirectAttributesModelMap modelMap){
        service.add(device);
        modelMap.addFlashAttribute("msg","更新成功");
        return "redirect:/admin/device/detail?id="+device.getClientId();
    }
}
