package com.bokyoung.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//ibatis나 Mybatis에서 Dao라고 불리는 DB layer 접근자.
//JPA에선 Repository라 부르며 인터페이스로 생성. JpaRepository<Entity 클래스, PK타입>
//이때, Entity 클래스와 기본 Entity Repository는 함께 위치해야 함. 도메인 패키지에서 함께 관리함.
public interface PostsRepository extends JpaRepository<Posts, Long> {
}