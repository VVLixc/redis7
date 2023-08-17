package com.lixc.redis7.controller;

import com.lixc.redis7.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.lixc.redis7.controller
 *
 * @author Lixc
 * @version 1.0
 * @since 2023-08-17 21:31
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order")
    public String   addOrder(){
        return orderService.order();
    }
}
