package ru.debuffi.rssservice;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableScheduling
@EnableFeignClients
@SpringBootApplication
public class RssServiceApplication {

    public static void main(String[] args) {
        final ConfigurableApplicationContext ctx = SpringApplication.run(RssServiceApplication.class, args);
        log.info("Toggle logger DEBUG mode to inspect Spring Boot beans list");

        final String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (final String beanName : beanNames) {
            log.debug("BeanName {}", beanName);
        }

        log.info("**********************************");
        log.info("* RssServiceApplication started *");
        log.info("**********************************");
    }

}
