package com.yjkim.springbootdeveloper.repository;

import com.yjkim.springbootdeveloper.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>
{
}
