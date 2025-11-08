package com.example.inflearn_text;

import com.example.inflearn_text.config.AppConfig;
import com.example.inflearn_text.domain.Grade;
import com.example.inflearn_text.domain.Member;
import com.example.inflearn_text.domain.Order;
import com.example.inflearn_text.service.MemberService;
import com.example.inflearn_text.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {
        //AppConfig appConfig = new AppConfig();
        //MemberService memberService = appConfig.memberService();
        //OrderService orderService = appConfig.orderService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order);
    }
}
