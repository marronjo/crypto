package com.marronjo.crypto.order.service.coinbase;

import com.marronjo.crypto.order.provider.OrderProvider;

public class CoinbaseService implements OrderProvider {
    @Override
    public String createOrder() {
        return "Coinbase order created successfully";
    }
}
