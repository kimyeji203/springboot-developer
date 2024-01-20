package com.yjkim.springbootdeveloper.business.test.service;

import com.yjkim.springbootdeveloper.domain.Member;
import com.yjkim.springbootdeveloper.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * {@link RequiredArgsConstructor} : 생성자 주입
 * {@link org.springframework.beans.factory.annotation.Autowired} : 필드 주입
 */
@Service
@RequiredArgsConstructor
public class TestService
{
    private final MemberRepository memberRepository;

    public List<Member> getAllMembers()
    {
        return memberRepository.findAll();
    }

}
