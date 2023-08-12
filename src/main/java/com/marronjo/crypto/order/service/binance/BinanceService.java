package com.marronjo.crypto.order.service.binance;

import com.marronjo.crypto.order.provider.OrderProvider;

public class BinanceService implements OrderProvider {
    @Override
    public String createOrder() {
        return "Binance order created successfully";
    }
}
