package com.qifu.ctuserservice;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class Application {

    private static final Logger LOG= Logger.getLogger( Application.class.getName() );

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping(value = "/hello_ctuserservice",method = RequestMethod.GET)
    public String hello() {
        LOG.log(Level.INFO, "requested Service 'ct-user-service'");
        return "Hello from service 'ct-user-service'.";
    }
}

