package com.jiangjf.dubbo.service.impl;

import com.jiangjf.dubbo.service.DemoDubboService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author jiangjf
 * @date 2021/10/4
 */
@DubboService
public class DemoDubboServiceImpl implements DemoDubboService {
    /**
     * 显示名称
     *
     * @param name
     * @return
     */
    @Override
    public String showName(String name) {
        System.out.println("执行了showName。。。");
        return "我的名字：" + name;
    }
}
