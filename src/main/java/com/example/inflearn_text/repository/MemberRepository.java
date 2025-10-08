package com.example.inflearn_text.repository;
import com.example.inflearn_text.domain.Member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
