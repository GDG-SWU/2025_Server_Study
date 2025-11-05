package com.example.inflearn_text.domain;

public class RateDiscountPolicy implements DiscountPolicy{

    @Override
    public int discount(Member member, int price){
        if(member.getGrade() == Grade.VIP){
            int discountPercent = 10;
            return price* discountPercent / 100;
        }
        else {
            return 0;
        }
    }
}
