package com.lixc.redis7;

import com.lixc.redis7.util.JedisDemo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;

import java.util.List;

@SpringBootTest
class Redis7ApplicationTests {
    @Autowired
    private JedisDemo jedisDemo;

    @Test
    void contextLoads() {
        Jedis jedis = jedisDemo.getJedis();
        List<String> stringList = jedis.mget("str1", "str2");
        for (String str : stringList) {
            System.out.println(str);
        }

        jedis.set("str3", "v3");
        System.out.println(jedis.get("str3"));
        jedis.lpush("list1", "1","2","3","4","5");
        System.out.println(jedis.lrange("list1", 0, -1));
        jedis.hset("hash1", "k1", "v1");
        System.out.println(jedis.hgetAll("hash1"));
        jedis.sadd("set1", "v1");
        System.out.println(jedis.smembers("set1"));
        jedis.zadd("zset1", 10, "v1");
        System.out.println(jedis.zrange("zset1", 0, -1));
    }

}
