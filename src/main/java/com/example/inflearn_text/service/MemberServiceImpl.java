package com.example.inflearn_text.service;

import com.example.inflearn_text.domain.Member;
import com.example.inflearn_text.repository.MemberRepository;
import com.example.inflearn_text.repository.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }
    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
