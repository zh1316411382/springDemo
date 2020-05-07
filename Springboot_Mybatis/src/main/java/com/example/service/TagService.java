package com.example.service;

import com.example.dto.PageBean;
import com.example.entity.TagBaseInfo;
import com.example.entity.TagCondition;

import java.util.List;

public interface TagService {
    //todo 分页
    PageBean getTagBaseInfoPage();

    //todo 多条件查询
    List<TagBaseInfo> findTagsByCondition(TagCondition tagCondition);

    //todo 关联查询

}
