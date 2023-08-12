package com.marronjo.crypto.order.controller;

import com.marronjo.crypto.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/create-order/{provider}")
    public ResponseEntity<String> createOrder(@PathVariable String provider){
        return ResponseEntity.status(HttpStatus.OK).body(orderService.createOrder(provider));
    }
}
