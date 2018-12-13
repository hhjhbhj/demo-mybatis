package com.example.demomybaitis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.demomybatis")
@SpringBootApplication
public class DemoMybaitisApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoMybaitisApplication.class, args);
  }
}
