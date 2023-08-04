package com.yjkim.springbootdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * {@link SpringBootApplication}
 *
 * {@link ComponentScan} Bean을 읽고 등록
 * {@link EnableAutoConfiguration} spring boot 서버가 실행될 때 spring boot 메타 파일을 읽고 정의된 설정을 자동 구성
 */
@SpringBootApplication // spring boot에 필요한 기본 설정을 해줌
public class SpringbootDeveloperApplication
{

    /**
     * spring boot가 시작되는 메인 메서드
     *
     * @param args
     */
    public static void main (String[] args)
    {
        SpringApplication.run(SpringbootDeveloperApplication.class, args);
    }

}
