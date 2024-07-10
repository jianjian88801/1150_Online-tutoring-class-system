package com.entity.model;

import com.entity.KechengBaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 课程报名
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KechengBaomingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 报名流水号
     */
    private String kechengBaomingUuidNumber;


    /**
     * 课程
     */
    private Integer kechengId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 状态
     */
    private Integer kechengBaomingYesnoTypes;


    /**
     * 报名时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：报名流水号
	 */
    public String getKechengBaomingUuidNumber() {
        return kechengBaomingUuidNumber;
    }


    /**
	 * 设置：报名流水号
	 */
    public void setKechengBaomingUuidNumber(String kechengBaomingUuidNumber) {
        this.kechengBaomingUuidNumber = kechengBaomingUuidNumber;
    }
    /**
	 * 获取：课程
	 */
    public Integer getKechengId() {
        return kechengId;
    }


    /**
	 * 设置：课程
	 */
    public void setKechengId(Integer kechengId) {
        this.kechengId = kechengId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：状态
	 */
    public Integer getKechengBaomingYesnoTypes() {
        return kechengBaomingYesnoTypes;
    }


    /**
	 * 设置：状态
	 */
    public void setKechengBaomingYesnoTypes(Integer kechengBaomingYesnoTypes) {
        this.kechengBaomingYesnoTypes = kechengBaomingYesnoTypes;
    }
    /**
	 * 获取：报名时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：报名时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
