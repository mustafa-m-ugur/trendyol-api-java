package org.trendyol.service;

import org.trendyol.dto.order.OrderDto;

public interface OrderService {
    OrderDto getOrderList(String... params);
}