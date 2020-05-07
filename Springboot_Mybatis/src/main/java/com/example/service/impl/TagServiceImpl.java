package com.example.service.impl;

import com.example.dto.PageBean;
import com.example.entity.TagBaseInfo;
import com.example.entity.TagCondition;
import com.example.mapper.TagBaseInfoMapper;
import com.example.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    @Autowired private TagBaseInfoMapper tagBaseInfoMapper;


    @Override
    public PageBean getTagBaseInfoPage() {
        return null;
    }

    @Override
    public List<TagBaseInfo> findTagsByCondition(TagCondition tagCondition) {
        tagBaseInfoMapper.selectByCondition(tagCondition);
        return null;
    }
}
