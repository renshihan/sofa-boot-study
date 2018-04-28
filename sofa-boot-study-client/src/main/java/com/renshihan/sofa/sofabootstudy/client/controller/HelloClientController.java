package com.renshihan.sofa.sofabootstudy.client.controller;

import com.renshihan.sofa.api.service.HelloSyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/27 17:51
 */
@Controller
@Slf4j
public class HelloClientController {
    @Autowired
    private HelloSyncService helloSyncService;
    @RequestMapping("/hello")
    public void hello(){
        log.info("[客户端]进入....");
        log.info("[客户端]调用服务"+helloSyncService.saySync("你好"));
        log.info("[客户端]结束....");

    }
}
