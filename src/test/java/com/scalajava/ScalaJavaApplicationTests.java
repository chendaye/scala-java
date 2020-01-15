package com.scalajava;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan(basePackages = {"com.scalajava"})
class ScalaJavaApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("测试入口");
    }

}
