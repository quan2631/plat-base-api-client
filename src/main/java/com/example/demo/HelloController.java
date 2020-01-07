package com.example.demo;

import com.wish.plat.base.api.OperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: QUAN
 * @date: Created in 2020/1/6 20:21
 * @description:
 * @modified By:
 */
@RestController
public class HelloController {

    @Autowired
    OperService OperService;

    @RequestMapping("/1")
    public String OperServiceImpl(){
        return  OperService.getOperListByOrg("1","2");
    }
    @RequestMapping("/2")
    public String OperServiceImpl2(){
        return "OperServiceImpl2";
    }
}
