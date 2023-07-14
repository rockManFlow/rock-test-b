package com.test.rockb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.rock.rpc.annotation.EnableRpc;

@SpringBootApplication(scanBasePackages = {"com"})
@Slf4j
@EnableRpc
public class TestBApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TestBApplication.class, args);
        log.info("TestBApplication run proId:{}",context.getId());
    }
}
