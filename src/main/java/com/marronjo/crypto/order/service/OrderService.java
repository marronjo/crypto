package com.marronjo.crypto.order.service;

import com.marronjo.crypto.order.provider.OrderProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderProviderService orderProviderService;
    public String createOrder(String provider){
        return orderProviderService.getProvider(provider).createOrder();
    }
}
