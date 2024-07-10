package com.entity.vo;

import com.entity.KechengBaomingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 课程报名
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kecheng_baoming")
public class KechengBaomingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 报名流水号
     */

    @TableField(value = "kecheng_baoming_uuid_number")
    private String kechengBaomingUuidNumber;


    /**
     * 课程
     */

    @TableField(value = "kecheng_id")
    private Integer kechengId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 状态
     */

    @TableField(value = "kecheng_baoming_yesno_types")
    private Integer kechengBaomingYesnoTypes;


    /**
     * 报名时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：报名流水号
	 */
    public String getKechengBaomingUuidNumber() {
        return kechengBaomingUuidNumber;
    }


    /**
	 * 获取：报名流水号
	 */

    public void setKechengBaomingUuidNumber(String kechengBaomingUuidNumber) {
        this.kechengBaomingUuidNumber = kechengBaomingUuidNumber;
    }
    /**
	 * 设置：课程
	 */
    public Integer getKechengId() {
        return kechengId;
    }


    /**
	 * 获取：课程
	 */

    public void setKechengId(Integer kechengId) {
        this.kechengId = kechengId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：状态
	 */
    public Integer getKechengBaomingYesnoTypes() {
        return kechengBaomingYesnoTypes;
    }


    /**
	 * 获取：状态
	 */

    public void setKechengBaomingYesnoTypes(Integer kechengBaomingYesnoTypes) {
        this.kechengBaomingYesnoTypes = kechengBaomingYesnoTypes;
    }
    /**
	 * 设置：报名时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：报名时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
