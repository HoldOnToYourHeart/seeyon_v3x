package com.seeyon.v3x.office.book.domain;

import java.util.Date;

import com.seeyon.v3x.office.common.domain.OfficeTypeInfo;


/**
 * MBookInfo generated by MyEclipse - Hibernate Tools
 */

public class MBookInfo  implements java.io.Serializable {


    // Fields    

     private Long bookId;
     private String bookName;
//     private String bookType;
     private OfficeTypeInfo officeType;   //类别
     private String bookCode;
     private Integer bookField;
     private String bookAuthor;
     private String bookPub;
     private Date bookDate;
     private Double bookPrice;
     private String bookSum;
     private Long bookTotal;
     private Long bookCount;
     private Long bookAvacount;
     private Long bookMge;
     private Date createDate;
     private Date modifyDate;
     private Integer bookState;
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
    public MBookInfo() {
    }

	/** minimal constructor */
    public MBookInfo(Long bookId, String bookName, OfficeTypeInfo officeType, Integer bookField, Long bookCount, Integer delFlag) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.officeType = officeType;
        this.bookField = bookField;
        this.bookCount = bookCount;
        this.delFlag = delFlag;
    }
    
    /** full constructor */
    public MBookInfo(Long bookId, String bookName, OfficeTypeInfo officeType, String bookCode, Integer bookField, String bookAuthor, String bookPub, Date bookDate, Double bookPrice, String bookSum, Long bookTotal, Long bookCount, Long bookAvacount, Long bookMge, Date createDate, Date modifyDate, Integer bookState, Integer delFlag) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.officeType = officeType;
        this.bookCode = bookCode;
        this.bookField = bookField;
        this.bookAuthor = bookAuthor;
        this.bookPub = bookPub;
        this.bookDate = bookDate;
        this.bookPrice = bookPrice;
        this.bookSum = bookSum;
        this.bookTotal = bookTotal;
        this.bookCount = bookCount;
        this.bookAvacount = bookAvacount;
        this.bookMge = bookMge;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.bookState = bookState;
        this.delFlag = delFlag;
    }

   
    // Property accessors

    public Long getBookId() {
        return this.bookId;
    }
    
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return this.bookName;
    }
    
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

//    public String getBookType() {
//        return this.bookType;
//    }
//    
//    public void setBookType(String bookType) {
//        this.bookType = bookType;
//    }

    public String getBookCode() {
        return this.bookCode;
    }
    
    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public Integer getBookField() {
        return this.bookField;
    }
    
    public void setBookField(Integer bookField) {
        this.bookField = bookField;
    }

    public String getBookAuthor() {
        return this.bookAuthor;
    }
    
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPub() {
        return this.bookPub;
    }
    
    public void setBookPub(String bookPub) {
        this.bookPub = bookPub;
    }

    public Date getBookDate() {
        return this.bookDate;
    }
    
    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    public Double getBookPrice() {
        return this.bookPrice;
    }
    
    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookSum() {
        return this.bookSum;
    }
    
    public void setBookSum(String bookSum) {
        this.bookSum = bookSum;
    }

    public Long getBookTotal() {
        return this.bookTotal;
    }
    
    public void setBookTotal(Long bookTotal) {
        this.bookTotal = bookTotal;
    }

    public Long getBookCount() {
        return this.bookCount;
    }
    
    public void setBookCount(Long bookCount) {
        this.bookCount = bookCount;
    }

    public Long getBookAvacount() {
        return this.bookAvacount;
    }
    
    public void setBookAvacount(Long bookAvacount) {
        this.bookAvacount = bookAvacount;
    }

    public Long getBookMge() {
        return this.bookMge;
    }
    
    public void setBookMge(Long bookMge) {
        this.bookMge = bookMge;
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

    public Integer getBookState() {
        return this.bookState;
    }
    
    public void setBookState(Integer bookState) {
        this.bookState = bookState;
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