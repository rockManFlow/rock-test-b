package com.test.rocka;

import com.rock.rpc.annotation.EnableRpc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.test.rocka"})
@Slf4j
@EnableRpc
public class TestAApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TestAApplication.class, args);
        log.info("TestAApplication run proId:{}",context.getId());
    }
}
