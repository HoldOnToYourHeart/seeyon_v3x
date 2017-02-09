package com.seeyon.v3x.office.asset.domain;

import java.util.Date;
import com.seeyon.v3x.office.common.domain.OfficeTypeInfo;

/**
 * MAssetInfo generated by MyEclipse - Hibernate Tools
 */

public class MAssetInfo  implements java.io.Serializable {


    // Fields    

     private Long assetId;
     private String assetCode;
     private String assetName;
//     private String assetType;
     private OfficeTypeInfo officeType;   //类别
     private String assetModel;
     private Long assetCount;
     private Long assetAvacount;
     private Date assetDate;
     private Double assetPrice;
     private Date createDate;
     private Date modifyDate;
     private Long assetMge;
     private Integer assetState;
     private Integer delFlag;
     private Long domainId;
     
 	public Long getDomainId() {
		return domainId;
	}

	public void setDomainId(Long domainId) {
		this.domainId = domainId;
	}


    // Constructors

    /** default constructor */
    public MAssetInfo() {
    }

	/** minimal constructor */
    public MAssetInfo(Long assetId, String assetName, OfficeTypeInfo officeType, Long assetCount, Integer delFlag) {
        this.assetId = assetId;
        this.assetName = assetName;
        this.officeType = officeType;
        this.assetCount = assetCount;
        this.delFlag = delFlag;
    }
    
    /** full constructor */
    public MAssetInfo(Long assetId, String assetCode, String assetName, OfficeTypeInfo officeType, String assetModel, Long assetCount, Long assetAvacount, Date assetDate, Double assetPrice, Date createDate, Date modifyDate, Long assetMge, Integer assetState, Integer delFlag) {
        this.assetId = assetId;
        this.assetCode = assetCode;
        this.assetName = assetName;
        this.officeType = officeType;
        this.assetModel = assetModel;
        this.assetCount = assetCount;
        this.assetAvacount = assetAvacount;
        this.assetDate = assetDate;
        this.assetPrice = assetPrice;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.assetMge = assetMge;
        this.assetState = assetState;
        this.delFlag = delFlag;
    }

   
    // Property accessors

    public Long getAssetId() {
        return this.assetId;
    }
    
    public void setAssetId(Long assetId) {
        this.assetId = assetId;
    }

    public String getAssetCode() {
        return this.assetCode;
    }
    
    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    public String getAssetName() {
        return this.assetName;
    }
    
    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

//    public String getAssetType() {
//        return this.assetType;
//    }
//    
//    public void setAssetType(String assetType) {
//        this.assetType = assetType;
//    }

    public String getAssetModel() {
        return this.assetModel;
    }
    
    public void setAssetModel(String assetModel) {
        this.assetModel = assetModel;
    }

    public Long getAssetCount() {
        return this.assetCount;
    }
    
    public void setAssetCount(Long assetCount) {
        this.assetCount = assetCount;
    }

    public Long getAssetAvacount() {
        return this.assetAvacount;
    }
    
    public void setAssetAvacount(Long assetAvacount) {
        this.assetAvacount = assetAvacount;
    }

    public Date getAssetDate() {
        return this.assetDate;
    }
    
    public void setAssetDate(Date assetDate) {
        this.assetDate = assetDate;
    }

    public Double getAssetPrice() {
        return this.assetPrice;
    }
    
    public void setAssetPrice(Double assetPrice) {
        this.assetPrice = assetPrice;
    }

    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return this.modifyDate;
    }
    
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Long getAssetMge() {
        return this.assetMge;
    }
    
    public void setAssetMge(Long assetMge) {
        this.assetMge = assetMge;
    }

    public Integer getAssetState() {
        return this.assetState;
    }
    
    public void setAssetState(Integer assetState) {
        this.assetState = assetState;
    }

    public Integer getDelFlag() {
        return this.delFlag;
    }
    
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public OfficeTypeInfo getOfficeType()
    {
        return officeType;
    }

    public void setOfficeType(OfficeTypeInfo officeType)
    {
        this.officeType = officeType;
    }
   








}