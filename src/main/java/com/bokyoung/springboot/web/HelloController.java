package com.bokyoung.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//컨트롤러를 json을 반환하는 컨트롤러로 만들어줌.
@RestController
public class HelloController {

    //Get의 요청을 받을 수 있는 API를 만들어줌.
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}