package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 课程报名
 *
 * @author 
 * @email
 */
@TableName("kecheng_baoming")
public class KechengBaomingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KechengBaomingEntity() {

	}

	public KechengBaomingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "KechengBaoming{" +
            "id=" + id +
            ", kechengBaomingUuidNumber=" + kechengBaomingUuidNumber +
            ", kechengId=" + kechengId +
            ", yonghuId=" + yonghuId +
            ", kechengBaomingYesnoTypes=" + kechengBaomingYesnoTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
