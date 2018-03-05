package com.hankal.weather.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yegang5211 on 2018/3/5.
 */
@Controller
@RequestMapping(value = "/weather")
@Api("天气预报相关的api接口介绍") //TODO：【swagger】
public class HelloController {

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    @ResponseBody
    public String hello1() {
        return "hello1,world!";
    }

    @GetMapping(value = "/hello2")
    @ResponseBody
    public String hello2() {
        return "hello2,world!";
    }
}

