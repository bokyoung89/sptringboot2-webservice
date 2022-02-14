package com.bokyoung.springboot.web.dto;

import com.bokyoung.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter     //선언된 모든 필드의 get 메소드를 생성함.
@NoArgsConstructor  //기본 생성자 자동 추가.
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;
    @Builder    //해당 클래스의 빌더 패턴 클래스를 생성. 객체를 생성해줌.
    public PostsSaveRequestDto(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }

}
