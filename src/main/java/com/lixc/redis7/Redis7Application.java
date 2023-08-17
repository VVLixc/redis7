package com.lixc.redis7;

import com.lixc.redis7.util.JedisDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import redis.clients.jedis.Jedis;

import java.util.List;

@SpringBootApplication
public class Redis7Application {
    public static void main(String[] args) {
        SpringApplication.run(Redis7Application.class, args);
    }



}
