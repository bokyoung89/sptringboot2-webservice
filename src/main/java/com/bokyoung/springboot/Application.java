package com.bokyoung.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//스프링부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정된다.
//항상 프로젝트 상단에 위치해야 함.
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //내장 WAS를 실행한다. 서버에 톰캣을 설치할 필요가 없고, 스프링 부트로 만들어진 Jar 파일로 실행하면 된다.
        SpringApplication.run(Application.class, args);
    }
}
