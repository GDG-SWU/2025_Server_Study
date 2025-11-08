package com.example.inflearn_text;

import com.example.inflearn_text.config.AppConfig;
import com.example.inflearn_text.domain.Grade;
import com.example.inflearn_text.domain.Member;
import com.example.inflearn_text.domain.Order;
import com.example.inflearn_text.service.MemberService;
import com.example.inflearn_text.service.OrderService;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order);
    }
}
