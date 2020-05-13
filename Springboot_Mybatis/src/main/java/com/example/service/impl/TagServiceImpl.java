package com.example.service.impl;

import com.example.dto.PageBean;
import com.example.entity.TagBaseInfo;
import com.example.entity.TagCondition;
import com.example.mapper.TagBaseInfoMapper;
import com.example.service.TagService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public PageInfo<TagBaseInfo> findTagsByCondition(TagCondition tagCondition) {

        PageHelper.startPage(tagCondition.getPageNum(),10);
        List<TagBaseInfo> tagBaseInfos1 = tagBaseInfoMapper.selectByCondition(tagCondition);
        PageInfo<TagBaseInfo> tagBaseInfos =new PageInfo<>(tagBaseInfos1) ;

        return tagBaseInfos;
    }
}
