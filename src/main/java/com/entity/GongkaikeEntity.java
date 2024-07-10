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
 * 公开课
 *
 * @author 
 * @email
 */
@TableName("gongkaike")
public class GongkaikeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GongkaikeEntity() {

	}

	public GongkaikeEntity(T t) {
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
     * 公开课名称
     */
    @TableField(value = "gongkaike_name")

    private String gongkaikeName;


    /**
     * 公开课照片
     */
    @TableField(value = "gongkaike_photo")

    private String gongkaikePhoto;


    /**
     * 公开课类型
     */
    @TableField(value = "gongkaike_types")

    private Integer gongkaikeTypes;


    /**
     * 公开课视频
     */
    @TableField(value = "gongkaike_video")

    private String gongkaikeVideo;


    /**
     * 公开课介绍
     */
    @TableField(value = "gongkaike_content")

    private String gongkaikeContent;


    /**
     * 添加时间
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
	 * 设置：公开课名称
	 */
    public String getGongkaikeName() {
        return gongkaikeName;
    }


    /**
	 * 获取：公开课名称
	 */

    public void setGongkaikeName(String gongkaikeName) {
        this.gongkaikeName = gongkaikeName;
    }
    /**
	 * 设置：公开课照片
	 */
    public String getGongkaikePhoto() {
        return gongkaikePhoto;
    }


    /**
	 * 获取：公开课照片
	 */

    public void setGongkaikePhoto(String gongkaikePhoto) {
        this.gongkaikePhoto = gongkaikePhoto;
    }
    /**
	 * 设置：公开课类型
	 */
    public Integer getGongkaikeTypes() {
        return gongkaikeTypes;
    }


    /**
	 * 获取：公开课类型
	 */

    public void setGongkaikeTypes(Integer gongkaikeTypes) {
        this.gongkaikeTypes = gongkaikeTypes;
    }
    /**
	 * 设置：公开课视频
	 */
    public String getGongkaikeVideo() {
        return gongkaikeVideo;
    }


    /**
	 * 获取：公开课视频
	 */

    public void setGongkaikeVideo(String gongkaikeVideo) {
        this.gongkaikeVideo = gongkaikeVideo;
    }
    /**
	 * 设置：公开课介绍
	 */
    public String getGongkaikeContent() {
        return gongkaikeContent;
    }


    /**
	 * 获取：公开课介绍
	 */

    public void setGongkaikeContent(String gongkaikeContent) {
        this.gongkaikeContent = gongkaikeContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
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
        return "Gongkaike{" +
            "id=" + id +
            ", gongkaikeName=" + gongkaikeName +
            ", gongkaikePhoto=" + gongkaikePhoto +
            ", gongkaikeTypes=" + gongkaikeTypes +
            ", gongkaikeVideo=" + gongkaikeVideo +
            ", gongkaikeContent=" + gongkaikeContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
