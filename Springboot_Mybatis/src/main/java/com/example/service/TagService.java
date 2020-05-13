package com.example.service;

import com.example.dto.PageBean;
import com.example.entity.TagBaseInfo;
import com.example.entity.TagCondition;
import com.github.pagehelper.PageInfo;

public interface TagService {
    //todo 分页
    PageBean getTagBaseInfoPage();

    //todo 多条件查询
    PageInfo<TagBaseInfo> findTagsByCondition(TagCondition tagCondition);

    //todo 关联查询

    //todo 批量插入

}
