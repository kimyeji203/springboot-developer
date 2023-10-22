package com.yjkim.springbootdeveloper.business.test.controller;

import com.yjkim.springbootdeveloper.business.test.service.TestService;
import com.yjkim.springbootdeveloper.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * {@link RestController}
 * {@link Controller}을 상속 => {@link org.springframework.stereotype.Component} 가지고 있음
 */
@RestController
@RequiredArgsConstructor
public class TestController
{
    private final TestService testService;

    @GetMapping("/test")
    public List<Member> getAllMembers ()
    {
        return testService.getAllMembers();
    }

}
