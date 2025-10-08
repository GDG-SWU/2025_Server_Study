package com.example.inflearn_text.order;

import com.example.inflearn_text.domain.Grade;
import com.example.inflearn_text.domain.Member;
import com.example.inflearn_text.domain.Order;
import com.example.inflearn_text.service.MemberService;
import com.example.inflearn_text.service.MemberServiceImpl;
import com.example.inflearn_text.service.OrderService;
import com.example.inflearn_text.service.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();
    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
