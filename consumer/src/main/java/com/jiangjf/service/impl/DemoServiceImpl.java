package com.jiangjf.service.impl;

import com.jiangjf.dubbo.service.DemoDubboService;
import com.jiangjf.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author jiangjf
 * @date 2021/10/4
 */
@Service
public class DemoServiceImpl implements DemoService {

    @DubboReference(loadbalance = "roundrobin")
    private DemoDubboService demoDubboService;

    /**
     * 显示名字
     *
     * @param name
     * @return
     */
    @Override
    public String showName(String name) {
        return demoDubboService.showName(name);
    }
}
