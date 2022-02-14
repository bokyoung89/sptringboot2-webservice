package com.bokyoung.springboot.web;

import com.bokyoung.springboot.service.posts.PostsService;
import com.bokyoung.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

 /*
 ### @RequiredArgsConstructor ###
 - Bean을 생성자로 주입받음. final이 선언된 모든 필드를 인자값으로 하는 생성자를 대신 생성해줌.
 - 해당 컨트롤러에 새로운 서비스를 추가하거나, 기존 컴포넌트를 제거하는 등의 상황이 발생해도 생성자 코드는 전혀 손대지 않아도 됨.
 */
@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;


}
