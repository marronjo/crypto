package com.marronjo.crypto.order.provider;

import com.marronjo.crypto.order.service.binance.BinanceService;
import com.marronjo.crypto.order.service.coinbase.CoinbaseService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ProviderService {
    private final HashMap<String, OrderProvider> providerMap = new HashMap<>();

    public ProviderService(){
        providerMap.put("coinbase", new CoinbaseService());
        providerMap.put("binance", new BinanceService());
    }

    public OrderProvider getProvider(String provider){
        OrderProvider orderProvider = providerMap.get(provider);
        if(orderProvider == null){
            throw new RuntimeException(String.format("Error fetching provider '%s'", provider));
        }
        return orderProvider;
    }
}
