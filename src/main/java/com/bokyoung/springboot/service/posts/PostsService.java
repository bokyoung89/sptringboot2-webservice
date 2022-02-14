package com.bokyoung.springboot.service.posts;

import com.bokyoung.springboot.domain.posts.PostsRepository;
import com.bokyoung.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor    //final이 선언된 모든 필드를 인자값으로 하는 생성자를 대신 생성해줌.
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
