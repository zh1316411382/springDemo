package com.example.pool;

import com.example.entity.TagBaseInfo;
import org.apache.commons.pool2.KeyedPooledObjectFactory;
import org.apache.commons.pool2.impl.GenericKeyedObjectPool;
import org.apache.commons.pool2.impl.GenericKeyedObjectPoolConfig;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: morris
 * @Date: 2020/6/18 17:05
 * @description
 * @reviewer
 */
public class TagBasePool  {
    static GenericKeyedObjectPool<String,TagBaseInfo> pool ;
    static {
        try {
            GenericKeyedObjectPoolConfig<TagBaseInfo> config = new GenericKeyedObjectPoolConfig();
            config.setMaxTotal(500);
            config.setMaxIdlePerKey(10);
            config.setMaxTotalPerKey(50);
            config.setMinIdlePerKey(1);
            config.setBlockWhenExhausted(true);
            config.setFairness(true);
            config.setMaxWaitMillis(50);
            KeyedPooledObjectFactory<String, TagBaseInfo> factory = new TagBaseFactory();
            pool = new GenericKeyedObjectPool(factory, config);

        } catch (Exception e) {
//            logger.error("create model pool exception", e);
        }
    }

    public static void main(String[] args) throws Exception {
        pool.addObject("111");
        pool.addObject("111");
        pool.addObject("111");
        System.out.println("================");
        TagBaseInfo tagBaseInfo = pool.borrowObject("111");
        System.out.println(tagBaseInfo);
        System.out.println(pool.borrowObject("111"));
        System.out.println(pool.borrowObject("111"));
        pool.returnObject("111",tagBaseInfo);
        System.out.println(pool.borrowObject("111"));
    }
}
