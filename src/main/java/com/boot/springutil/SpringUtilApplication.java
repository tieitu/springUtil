package com.boot.springUtil;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringUtilApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringUtilApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // 打印竖中指的图案
        System.out.println("╭∩╮（︶︿︶）╭∩╮");
    }
}
