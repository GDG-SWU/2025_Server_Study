package com.example.inflearn_text.service;

import com.example.inflearn_text.domain.Member;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);

}
