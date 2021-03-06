package com.example.controller;

import com.example.mapper.TagBaseInfoMapper;
import com.example.entity.TagBaseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


/**
 * @author morris
 */
@RestController
@RequestMapping("/tag")
public class TagBaseController {
    @Autowired
    private TagBaseInfoMapper tagBaseInfoMapper;

    @GetMapping("/findById")
    public Object findById(@RequestParam(value = "id") Long id){
        ArrayList<Object> objects = new ArrayList<>();
        TagBaseInfo tagBaseInfo = tagBaseInfoMapper.selectByPrimaryKey(id);
        System.out.println(tagBaseInfo);
        return tagBaseInfo;
    }
}
