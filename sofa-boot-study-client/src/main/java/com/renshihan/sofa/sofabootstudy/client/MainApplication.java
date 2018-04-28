package com.renshihan.sofa.sofabootstudy.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource({ "classpath*:rpc-sofa-boot-starter-client.xml" })
@SpringBootApplication
@Slf4j
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
		log.info("sofa rpc 测试客户端启动成功....");
	}
}
