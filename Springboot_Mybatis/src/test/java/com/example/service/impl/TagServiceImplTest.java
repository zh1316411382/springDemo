package com.example.service.impl;

import com.example.entity.TagCondition;
import com.example.service.TagService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TagServiceImplTest extends TestCase {
    @Autowired
    TagService tagService;

    public void testGetTagBaseInfoPage() {
    }
    @Test
    public void testFindTagsByCondition() {

        TagCondition tagCondition = TagCondition.builder()
//                        .tagId(1424l)
//                .createName("张")
//                        .chargeId()
                .pageNum(1)
                .pageSize(10)
                .build();
        System.out.println(tagService.findTagsByCondition(tagCondition));
    }
}