package com.scalajava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
//@ComponentScan(basePackages = {"com.scalajava.repository"})
public class ScalaJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScalaJavaApplication.class, args);
    }

}
