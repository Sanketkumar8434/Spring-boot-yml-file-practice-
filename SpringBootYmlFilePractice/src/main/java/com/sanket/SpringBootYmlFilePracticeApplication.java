package com.sanket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootYmlFilePracticeApplication {

    public static void main(String[] args) {
       ConfigurableApplicationContext ctx =
                            SpringApplication.run(SpringBootYmlFilePracticeApplication.class, args);
       Employee employee = ctx.getBean(Employee.class);
       System.out.println(employee);
       ctx.close();
    }

}
