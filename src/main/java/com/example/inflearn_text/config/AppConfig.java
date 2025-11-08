package com.example.inflearn_text.config;

import com.example.inflearn_text.domain.DiscountPolicy;
import com.example.inflearn_text.domain.RateDiscountPolicy;
import com.example.inflearn_text.repository.MemberRepository;
import com.example.inflearn_text.repository.MemoryMemberRepository;
import com.example.inflearn_text.service.MemberService;
import com.example.inflearn_text.service.MemberServiceImpl;
import com.example.inflearn_text.service.OrderService;
import com.example.inflearn_text.service.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public static MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
