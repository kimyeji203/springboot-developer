package com.yjkim.springbootdeveloper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@link RestController}
 *  {@link Controller}을 상속 => {@link org.springframework.stereotype.Component} 가지고 있음
 */
@RestController
public class TestController
{
    @GetMapping("/test")
    public String test() {
        return "Hello, world!";
    }
}
