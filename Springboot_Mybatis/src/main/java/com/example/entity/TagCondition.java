package com.example.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class TagCondition {
    private Long tagId;
    private String createName;
    private Long chargeId;

    private int pageNum;
    private int pageSize;

}
