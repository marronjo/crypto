package com.marronjo.crypto.order.service;

import com.marronjo.crypto.order.provider.ProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final ProviderService providerService;
    public String createOrder(String provider){
        return providerService.getProvider(provider).createOrder();
    }
}
