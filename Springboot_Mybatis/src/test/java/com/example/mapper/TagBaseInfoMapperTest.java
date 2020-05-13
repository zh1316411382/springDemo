package com.example.mapper;

import com.example.entity.TagCondition;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TagBaseInfoMapperTest {

    @Autowired private TagBaseInfoMapper tagBaseInfoMapper;
    @Test
    public void testDeleteByPrimaryKey() {
    }

    @Test
    public void testInsert() {
    }

    @Test
    public void testSelectByPrimaryKey() {
    }

    @Test
    public void testSelectAll() {
    }

    @Test
    public void testUpdateByPrimaryKey() {
        String a = null;

        System.out.println(a+"11");
    }

    @Test
    public void testSelectByCondition() {
        tagBaseInfoMapper.selectByCondition(
                TagCondition.builder()
//                        .tagId(1424l)
                        .createName("张")
//                        .chargeId()
                        .build()).stream().forEach(tagBaseInfo -> {
            System.out.println(tagBaseInfo);
            System.out.println(tagBaseInfo.getTagChargePerson());
        });
    }

    @Test
    public void testSelectBy() {
        tagBaseInfoMapper.selectBy().stream().forEach(tagBaseInfo -> {
            System.out.println(tagBaseInfo);
            System.out.println(tagBaseInfo.getAlarm());
            System.out.println(tagBaseInfo.getTagChargePerson());
        });
        System.out.println();
    }
}