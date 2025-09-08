package com.jojoldu.book.springboot.web.dto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    public static class HelloResponseDto {
        // 스프링 부트의 자동 설정, 스프링 brean 읽기와 생성을 모두 자동
        @SpringBootApplication
        public static class Application {
            public static void main(String[] args) {
                SpringApplication.run(Application.class, args);

            }
        }
    }
}