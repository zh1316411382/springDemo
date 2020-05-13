package com.example.mapper;

import com.example.entity.TagChargePerson;
import java.util.List;

public interface TagChargePersonMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TagChargePerson record);

    TagChargePerson selectByPrimaryKey(Long id);

    List<TagChargePerson> selectAll();

    int updateByPrimaryKey(TagChargePerson record);
}