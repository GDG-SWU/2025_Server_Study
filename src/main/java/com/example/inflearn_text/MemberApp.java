package com.example.inflearn_text;

import com.example.inflearn_text.config.AppConfig;
import com.example.inflearn_text.domain.Grade;
import com.example.inflearn_text.domain.Member;
import com.example.inflearn_text.service.MemberService;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }

}
