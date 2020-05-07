package com.example.entity;

import java.io.Serializable;
import java.util.Date;

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

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getCreateDepartment() {
        return createDepartment;
    }

    public void setCreateDepartment(String createDepartment) {
        this.createDepartment = createDepartment == null ? null : createDepartment.trim();
    }

    public String getCreateDepartmentId() {
        return createDepartmentId;
    }

    public void setCreateDepartmentId(String createDepartmentId) {
        this.createDepartmentId = createDepartmentId == null ? null : createDepartmentId.trim();
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUid() {
        return createUid;
    }

    public void setCreateUid(String createUid) {
        this.createUid = createUid == null ? null : createUid.trim();
    }

    public Date getDataInitDate() {
        return dataInitDate;
    }

    public void setDataInitDate(Date dataInitDate) {
        this.dataInitDate = dataInitDate;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getDeleteUid() {
        return deleteUid;
    }

    public void setDeleteUid(String deleteUid) {
        this.deleteUid = deleteUid == null ? null : deleteUid.trim();
    }

    public Long getFirstId() {
        return firstId;
    }

    public void setFirstId(Long firstId) {
        this.firstId = firstId;
    }

    public Integer getIsDatePartition() {
        return isDatePartition;
    }

    public void setIsDatePartition(Integer isDatePartition) {
        this.isDatePartition = isDatePartition;
    }

    public Integer getIsMultiValue() {
        return isMultiValue;
    }

    public void setIsMultiValue(Integer isMultiValue) {
        this.isMultiValue = isMultiValue;
    }

    public Integer getMethodType() {
        return methodType;
    }

    public void setMethodType(Integer methodType) {
        this.methodType = methodType;
    }

    public String getOfflineReason() {
        return offlineReason;
    }

    public void setOfflineReason(String offlineReason) {
        this.offlineReason = offlineReason == null ? null : offlineReason.trim();
    }

    public Date getOfflineTime() {
        return offlineTime;
    }

    public void setOfflineTime(Date offlineTime) {
        this.offlineTime = offlineTime;
    }

    public String getOfflineUid() {
        return offlineUid;
    }

    public void setOfflineUid(String offlineUid) {
        this.offlineUid = offlineUid == null ? null : offlineUid.trim();
    }

    public Integer getOnlineState() {
        return onlineState;
    }

    public void setOnlineState(Integer onlineState) {
        this.onlineState = onlineState;
    }

    public Date getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Date onlineTime) {
        this.onlineTime = onlineTime;
    }

    public String getOnlineUid() {
        return onlineUid;
    }

    public void setOnlineUid(String onlineUid) {
        this.onlineUid = onlineUid == null ? null : onlineUid.trim();
    }

    public Float getPrecisRate() {
        return precisRate;
    }

    public void setPrecisRate(Float precisRate) {
        this.precisRate = precisRate;
    }

    public Integer getPrikeyType() {
        return prikeyType;
    }

    public void setPrikeyType(Integer prikeyType) {
        this.prikeyType = prikeyType;
    }

    public Float getRecallRate() {
        return recallRate;
    }

    public void setRecallRate(Float recallRate) {
        this.recallRate = recallRate;
    }

    public Long getSecondId() {
        return secondId;
    }

    public void setSecondId(Long secondId) {
        this.secondId = secondId;
    }

    public Integer getTagCount() {
        return tagCount;
    }

    public void setTagCount(Integer tagCount) {
        this.tagCount = tagCount;
    }

    public String getTagEnName() {
        return tagEnName;
    }

    public void setTagEnName(String tagEnName) {
        this.tagEnName = tagEnName == null ? null : tagEnName.trim();
    }

    public Integer getTagFieldType() {
        return tagFieldType;
    }

    public void setTagFieldType(Integer tagFieldType) {
        this.tagFieldType = tagFieldType;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public Integer getTagType() {
        return tagType;
    }

    public void setTagType(Integer tagType) {
        this.tagType = tagType;
    }

    public Integer getUpdateCycle() {
        return updateCycle;
    }

    public void setUpdateCycle(Integer updateCycle) {
        this.updateCycle = updateCycle;
    }

    public Integer getUpdatePriority() {
        return updatePriority;
    }

    public void setUpdatePriority(Integer updatePriority) {
        this.updatePriority = updatePriority;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUid() {
        return updateUid;
    }

    public void setUpdateUid(String updateUid) {
        this.updateUid = updateUid == null ? null : updateUid.trim();
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }

    public Integer getIsIncrement() {
        return isIncrement;
    }

    public void setIsIncrement(Integer isIncrement) {
        this.isIncrement = isIncrement;
    }

    public Integer getTagValueIsEnum() {
        return tagValueIsEnum;
    }

    public void setTagValueIsEnum(Integer tagValueIsEnum) {
        this.tagValueIsEnum = tagValueIsEnum;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getTagImportType() {
        return tagImportType;
    }

    public void setTagImportType(Integer tagImportType) {
        this.tagImportType = tagImportType;
    }

    public Integer getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(Integer securityLevel) {
        this.securityLevel = securityLevel;
    }

    public String getDeletReason() {
        return deletReason;
    }

    public void setDeletReason(String deletReason) {
        this.deletReason = deletReason == null ? null : deletReason.trim();
    }

    public Integer getTagWeight() {
        return tagWeight;
    }

    public void setTagWeight(Integer tagWeight) {
        this.tagWeight = tagWeight;
    }

    public Integer getTestTag() {
        return testTag;
    }

    public void setTestTag(Integer testTag) {
        this.testTag = testTag;
    }

    public Integer getExternalTaskId() {
        return externalTaskId;
    }

    public void setExternalTaskId(Integer externalTaskId) {
        this.externalTaskId = externalTaskId;
    }

    public String getAlarm() {
        return alarm;
    }

    public void setAlarm(String alarm) {
        this.alarm = alarm == null ? null : alarm.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public Integer getFileInfoId() {
        return fileInfoId;
    }

    public void setFileInfoId(Integer fileInfoId) {
        this.fileInfoId = fileInfoId;
    }

    public Integer getPrimaryKeyType() {
        return primaryKeyType;
    }

    public void setPrimaryKeyType(Integer primaryKeyType) {
        this.primaryKeyType = primaryKeyType;
    }

    public Integer getUpdateCycleTime() {
        return updateCycleTime;
    }

    public void setUpdateCycleTime(Integer updateCycleTime) {
        this.updateCycleTime = updateCycleTime;
    }

    public String getBusinessRequirements() {
        return businessRequirements;
    }

    public void setBusinessRequirements(String businessRequirements) {
        this.businessRequirements = businessRequirements == null ? null : businessRequirements.trim();
    }

    public String getTagEnNameText() {
        return tagEnNameText;
    }

    public void setTagEnNameText(String tagEnNameText) {
        this.tagEnNameText = tagEnNameText == null ? null : tagEnNameText.trim();
    }

    public String getReviewFailReason() {
        return reviewFailReason;
    }

    public void setReviewFailReason(String reviewFailReason) {
        this.reviewFailReason = reviewFailReason == null ? null : reviewFailReason.trim();
    }

    public Integer getReviewState() {
        return reviewState;
    }

    public void setReviewState(Integer reviewState) {
        this.reviewState = reviewState;
    }

    public String getExpectedPerformanceTime() {
        return expectedPerformanceTime;
    }

    public void setExpectedPerformanceTime(String expectedPerformanceTime) {
        this.expectedPerformanceTime = expectedPerformanceTime == null ? null : expectedPerformanceTime.trim();
    }

    public String getTagDesc() {
        return tagDesc;
    }

    public void setTagDesc(String tagDesc) {
        this.tagDesc = tagDesc == null ? null : tagDesc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", available=").append(available);
        sb.append(", createDepartment=").append(createDepartment);
        sb.append(", createDepartmentId=").append(createDepartmentId);
        sb.append(", createName=").append(createName);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUid=").append(createUid);
        sb.append(", dataInitDate=").append(dataInitDate);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", deleteUid=").append(deleteUid);
        sb.append(", firstId=").append(firstId);
        sb.append(", isDatePartition=").append(isDatePartition);
        sb.append(", isMultiValue=").append(isMultiValue);
        sb.append(", methodType=").append(methodType);
        sb.append(", offlineReason=").append(offlineReason);
        sb.append(", offlineTime=").append(offlineTime);
        sb.append(", offlineUid=").append(offlineUid);
        sb.append(", onlineState=").append(onlineState);
        sb.append(", onlineTime=").append(onlineTime);
        sb.append(", onlineUid=").append(onlineUid);
        sb.append(", precisRate=").append(precisRate);
        sb.append(", prikeyType=").append(prikeyType);
        sb.append(", recallRate=").append(recallRate);
        sb.append(", secondId=").append(secondId);
        sb.append(", tagCount=").append(tagCount);
        sb.append(", tagEnName=").append(tagEnName);
        sb.append(", tagFieldType=").append(tagFieldType);
        sb.append(", tagName=").append(tagName);
        sb.append(", tagType=").append(tagType);
        sb.append(", updateCycle=").append(updateCycle);
        sb.append(", updatePriority=").append(updatePriority);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUid=").append(updateUid);
        sb.append(", uri=").append(uri);
        sb.append(", isIncrement=").append(isIncrement);
        sb.append(", tagValueIsEnum=").append(tagValueIsEnum);
        sb.append(", endTime=").append(endTime);
        sb.append(", tagImportType=").append(tagImportType);
        sb.append(", securityLevel=").append(securityLevel);
        sb.append(", deletReason=").append(deletReason);
        sb.append(", tagWeight=").append(tagWeight);
        sb.append(", testTag=").append(testTag);
        sb.append(", externalTaskId=").append(externalTaskId);
        sb.append(", alarm=").append(alarm);
        sb.append(", brand=").append(brand);
        sb.append(", fileInfoId=").append(fileInfoId);
        sb.append(", primaryKeyType=").append(primaryKeyType);
        sb.append(", updateCycleTime=").append(updateCycleTime);
        sb.append(", businessRequirements=").append(businessRequirements);
        sb.append(", tagEnNameText=").append(tagEnNameText);
        sb.append(", reviewFailReason=").append(reviewFailReason);
        sb.append(", reviewState=").append(reviewState);
        sb.append(", expectedPerformanceTime=").append(expectedPerformanceTime);
        sb.append(", tagDesc=").append(tagDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}