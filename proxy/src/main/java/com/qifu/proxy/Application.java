package com.qifu.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger.web.UiConfiguration;

@SpringBootApplication
@EnableZuulProxy
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//    @Bean
//    UiConfiguration uiConfig() {
//        return new UiConfiguration("validatorUrl", "list", "alpha", "schema",
//                UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS, false, true, 60000L);
//    }
}
