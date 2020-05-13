package com.example.mapper;

import com.example.entity.TagBaseInfo;
import com.example.entity.TagCondition;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TagBaseInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TagBaseInfo record);

    TagBaseInfo selectByPrimaryKey(Long id);

    List<TagBaseInfo> selectAll();

    int updateByPrimaryKey(TagBaseInfo record);

    //动态sql
    List<TagBaseInfo> selectByCondition(TagCondition tagCondition);

    //todo 关联查询
    List<TagBaseInfo> selectBy();
}