package com.lixc.redis7.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * com.lixc.redis7.util
 *
 * @author Lixc
 * @version 1.0
 * @since 2023-08-16 21:51
 */
@Component
public class JedisDemo {
    @Value("${myredis.ip}")
    private String redisIp;

    @Value("${myredis.port}")
    private Integer port;

    @Value("${myredis.auth}")
    private String auth;

    public Jedis getJedis(){
        Jedis jedis = new Jedis(redisIp, port);
        jedis.auth(auth);
        return jedis;
    }
}
