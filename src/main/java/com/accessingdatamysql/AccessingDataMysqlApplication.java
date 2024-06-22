package com.accessingdatamysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AccessingDataMysqlApplication {

    // This REST endpoint method is not required for any of the features of application,
    // however is left here to confirm the application works when packaged as a war file.
    @GetMapping("/hello")
    public String hello2() {
        return "Hello Again";
    }

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataMysqlApplication.class, args);
    }

}
