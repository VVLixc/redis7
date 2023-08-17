package com.lixc.redis7.service;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/**
 * com.lixc.redis7.service
 *
 * @author Lixc
 * @version 1.0
 * @since 2023-08-17 21:28
 */
@Service
public class OrderService {
    public static final String ORDER_KEY="ord:";

    @Resource
    //private RedisTemplate redisTemplate;
    private StringRedisTemplate stringRedisTemplate;

    public String order(){
        int keyId = ThreadLocalRandom.current().nextInt(1000) + 1;
        String orderNo = UUID.randomUUID().toString();

        //redisTemplate.opsForValue().set(ORDER_KEY+keyId, "订单："+orderNo);
        stringRedisTemplate.opsForValue().set(ORDER_KEY+keyId, "订单："+orderNo);
       return "编号"+keyId+"的订单流水生成："+orderNo;
    }
}
