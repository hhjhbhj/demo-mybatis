package com.example.demomybaitis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan("com.example.demomybatis")
@SpringBootApplication
public class DemoMybaitisApplication extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return builder.sources(DemoMybaitisApplication.class);
  }
  public static void main(String[] args) {
    SpringApplication.run(DemoMybaitisApplication.class, args);
  }
}
