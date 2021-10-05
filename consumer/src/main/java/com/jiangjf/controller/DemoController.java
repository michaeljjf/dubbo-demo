package com.jiangjf.controller;

import com.jiangjf.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author jiangjf
 * @date 2021/10/4
 */
@Controller
public class DemoController {

    @Resource
    private DemoService demoService;

    @RequestMapping("/show")
    @ResponseBody
    public String show() {
        return demoService.showName("张三丰");
    }
}
