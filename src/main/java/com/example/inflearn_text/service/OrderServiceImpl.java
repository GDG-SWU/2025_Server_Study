package com.example.inflearn_text.service;

import com.example.inflearn_text.domain.DiscountPolicy;
import com.example.inflearn_text.domain.FixDiscountPolicy;
import com.example.inflearn_text.domain.Member;
import com.example.inflearn_text.domain.Order;
import com.example.inflearn_text.repository.MemberRepository;
import com.example.inflearn_text.repository.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
