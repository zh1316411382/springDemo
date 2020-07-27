package com.example.pool;

import com.example.entity.TagBaseInfo;
import org.apache.commons.pool2.BaseKeyedPooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;

import java.util.Random;

/**
 * @Author: morris
 * @Date: 2020/6/18 17:02
 * @description
 * @reviewer
 */
public class TagBaseFactory extends BaseKeyedPooledObjectFactory<String, TagBaseInfo> {
    @Override
    public TagBaseInfo create(String s) throws Exception {
        TagBaseInfo tagBaseInfo = new TagBaseInfo();
        Random random = new Random();
//        random.nextInt();
        tagBaseInfo.setId(random.nextLong());
        System.out.println("&"+tagBaseInfo);
        return tagBaseInfo;
    }

    @Override
    public PooledObject<TagBaseInfo> wrap(TagBaseInfo tagBaseInfo) {
        return new DefaultPooledObject(tagBaseInfo);
    }
}
