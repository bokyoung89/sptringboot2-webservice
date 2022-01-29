package com.bokyoung.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//어노테이션 순서 : 필수 어노테이션을 클래스에 가깝게. 새 언어 전환으로 롬복이 필요없을 경우 쉽게 삭제 가능함.
@Getter //롬복 라이브러리 : 클래스 내 모든 필드의 Getter 메소드를 자동생성
@NoArgsConstructor  // 롬복 라이브러리 : 기본 생성자 자동 추가, public Post(){}같은 효과
@Entity //테이블과 링크될 클래스임을 나타냄.
//Posts 클래스는 실제 DB 테이블과 매칭. JPA를 사용하면 DB 데이터에 작업할 경우 실제 쿼리를 날리기 보다, Entity 클래스 수정을 통해 작업함.
public class Posts {

    @Id //해당 테이블의 PK. 이때, PK는 Long 타입의 Auto_increment를 추천. 주민등록번호, 복합키는 유니크 키를 별도로 추가.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK 생성 규칙.
    private Long id;

    @Column(length = 500, nullable = false) //테이블의 칼럼을 나타냄. 굳이 선언하지 않아도 해당 클래스의 필드는 모두 칼럼이 됨. 기본값 외에 추가로 변경이 필요한 옵션이 있을 때 사용
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder    //롬복 라이브러리 : 해당 클래스의 빌드 패턴 클래스를 생성, 생성사 상단에 선언 시 생서자에 포함된 빌더만 포함
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}