package com.yjkim.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본 생성자 자동 선언
@AllArgsConstructor
@Getter
@Entity(name = "member") // JPA Entity로 지정 (DB의 Table과 매칭 시킴, name default : class name) => 영속성을 가진 객체를 의미
public class Member
{
    @Id // PK로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto +1
    @Column(name = "id", updatable = false)
    private Long id;

    /**
     * {@link Column} 속성 : name, nullable, unique, columnDefinition
     */
    @Column(name = "name", nullable = false)
    private String name;
}
