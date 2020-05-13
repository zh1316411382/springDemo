package com.example.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
public class TagBaseInfo implements Serializable {
    private Long id;

    private Integer available;

    private String createDepartment;

    private String createDepartmentId;

    private String createName;

    private Date createTime;

    private String createUid;

    private Date dataInitDate;

    private Date deleteTime;

    private String deleteUid;

    private Long firstId;

    private Integer isDatePartition;

    private Integer isMultiValue;

    private Integer methodType;

    private String offlineReason;

    private Date offlineTime;

    private String offlineUid;

    private Integer onlineState;

    private Date onlineTime;

    private String onlineUid;

    private Float precisRate;

    private Integer prikeyType;

    private Float recallRate;

    private Long secondId;

    private Integer tagCount;

    private String tagEnName;

    private Integer tagFieldType;

    private String tagName;

    private Integer tagType;

    private Integer updateCycle;

    private Integer updatePriority;

    private Date updateTime;

    private String updateUid;

    private String uri;

    private Integer isIncrement;

    private Integer tagValueIsEnum;

    private Date endTime;

    private Integer tagImportType;

    private Integer securityLevel;

    private String deletReason;

    private Integer tagWeight;

    private Integer testTag;

    private Integer externalTaskId;

    private String alarm;

    private String brand;

    private Integer fileInfoId;

    private Integer primaryKeyType;

    private Integer updateCycleTime;

    private String businessRequirements;

    private String tagEnNameText;

    private String reviewFailReason;

    private Integer reviewState;

    private String expectedPerformanceTime;

    private String tagDesc;

    private List<TagChargePerson> tagChargePerson;



    private static final long serialVersionUID = 1L;


}