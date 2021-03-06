package com.redis.base;

import redis.clients.jedis.HostAndPort;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 18-3-20.
 */
public interface BaseConstants {
    String REDIS_LIST_KEY = "redis_list";
    String REDIS_HASH_KEY = "redis_hash";
    String REDIS_SET_KEY = "redis_set";
    String REDIS_ZSET_KEY = "redis_zset";
    String REDIS_BIT_KEY = "redis_bit";
    String REDIS_HLL_KEY = "redis_hll";

    String REDIS_VISIT_USER = "user";

    String REDIS_DEFAULT_HOST = "localhost";
    int REDIS_DEFAULT_PORT = 6379;

    Set<HostAndPort> CLUSTER_HOST_AND_PORTS = new HashSet(){{
        add(new HostAndPort("127.0.0.1", 6380));
        add(new HostAndPort("127.0.0.1", 6381));
        add(new HostAndPort("127.0.0.1", 6382));
        add(new HostAndPort("127.0.0.1", 6383));
        add(new HostAndPort("127.0.0.1", 6384));
        add(new HostAndPort("127.0.0.1", 6385));
    }};
}
