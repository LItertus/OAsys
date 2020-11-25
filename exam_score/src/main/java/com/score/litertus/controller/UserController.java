package com.score.litertus.controller;


import com.score.litertus.entity.Manager;
import com.score.litertus.service.ManagerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("user")
@Slf4j
public class UserController {

    @Autowired
    private ManagerService managerService;
    /**
    用户注册
     */
    @PostMapping("register")
    public Map<String,Object> register(@RequestBody Manager manager){
        Map<String,Object> map = new HashMap<>();
        try {
            managerService.register(manager);
            map.put("status",true);
            map.put("msg","提示：注册成功!");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("status",false);
            map.put("msg","提示：注册失败!");
        }
        return map;
    }
}