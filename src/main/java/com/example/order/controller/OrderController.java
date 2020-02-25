package com.example.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
	
	@GetMapping("/status")
    public String orderStatus(@RequestParam String orderId) {
		
        System.out.println("Checking status for order with orderId " + orderId);
        return "Order is ready";
    }
	
	@GetMapping("/")
    public String homePage() {
        return "home";
    }

}
