package com.example.inflearn_text.service;

import com.example.inflearn_text.domain.Order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
