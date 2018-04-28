package com.renshihan.sofa.sofabootstudy.server.service.impl;

import com.renshihan.sofa.api.service.HelloSyncService;
import org.springframework.stereotype.Component;

/**
 * @author renshihan@winchannel.net
 * @date 2018/4/27 14:22
 */
@Component("HelloSyncService")
public class HelloSyncServiceImpl implements HelloSyncService {
    @Override
    public String saySync(String msg) {
        return "[服务器端]接收数据:"+msg+",并返回";
    }
}
