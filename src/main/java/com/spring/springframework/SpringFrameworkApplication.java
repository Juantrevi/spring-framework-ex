package com.spring.springframework;

import com.spring.springframework.controller.MyWebController;
import com.spring.springframework.game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringFrameworkApplication.class, args);

        GameRunner runner = context.getBean(GameRunner.class);
        runner.run();

        MyWebController controller = context.getBean(MyWebController.class);
        System.out.println(controller.returnValueFromBusinessService());
    }

}
