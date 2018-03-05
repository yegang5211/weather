package com.hankal.weather.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/demo")
@Api("天气预报相关的api接口介绍") //TODO：【swagger】
public class HiController {

    @RequestMapping(value = "/h1", method = RequestMethod.GET)
    @ResponseBody
    public String hello1() {
        return "h1,world!";
    }

    @GetMapping(value = "/h2")
    @ResponseBody
    public String hello2() {
        return "h2,world!";
    }
}
