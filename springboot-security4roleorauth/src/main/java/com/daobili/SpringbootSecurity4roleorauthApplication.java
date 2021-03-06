package com.daobili;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

/**
 * @author bamaw
 */

@MapperScan("com.daobili.mapper")
@SpringBootApplication
public class SpringbootSecurity4roleorauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSecurity4roleorauthApplication.class, args);
    }

}
