package com.example.service.impl;

import com.example.entity.User;
import com.example.service.UserPredicate;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class java8StreamTest {
    //创建无线流测试
    private Stream generateStream;
    private List<String> stringList;

//    @Before
    public void getStream(boolean wireless) {
        stringList = new ArrayList<>(Arrays.asList("fjdsalf", "fdsafsda", "aaaa"));
        if (wireless) {
            generateStream = Stream.generate(UUID::randomUUID);
        }else {
            generateStream = stringList.stream();
        }
    }

    /**
     * 行为参数化
     * 1、创建策略接口，定义策略方法
     * 2、参数定义为接口，调用时传递接口的实现方法
     */
    @Test
    public void behaviorParam() {
        User user = User.builder().userName("zz").realName("11").build();
        User user2 = User.builder().userName("ee").realName("11").build();
        List<User> userList = new ArrayList<>(Arrays.asList(user, user2));
        behaviorParamMethod(userList, (User u) -> "ee".equals(u.getUserName()));
    }

    public void behaviorParamMethod(List<User> userList, UserPredicate userPredicate) {
        for (User u : userList) {
            if (userPredicate.judgeUser(u)) {
                System.out.println(u);
            }
        }
    }


    @Test
    public void streamTranslate() {
        getStream(false);
        List<String> collect =  stringList.stream().peek(x -> {
            System.out.println(1);
        }).collect(Collectors.toList());
        System.out.println("2222222222");
        stringList.add("23232");
//        collect.contains();


    }


}