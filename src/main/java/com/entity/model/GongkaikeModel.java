package com.entity.model;

import com.entity.GongkaikeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 公开课
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GongkaikeModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 公开课名称
     */
    private String gongkaikeName;


    /**
     * 公开课照片
     */
    private String gongkaikePhoto;


    /**
     * 公开课类型
     */
    private Integer gongkaikeTypes;


    /**
     * 公开课视频
     */
    private String gongkaikeVideo;


    /**
     * 公开课介绍
     */
    private String gongkaikeContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：公开课名称
	 */
    public String getGongkaikeName() {
        return gongkaikeName;
    }


    /**
	 * 设置：公开课名称
	 */
    public void setGongkaikeName(String gongkaikeName) {
        this.gongkaikeName = gongkaikeName;
    }
    /**
	 * 获取：公开课照片
	 */
    public String getGongkaikePhoto() {
        return gongkaikePhoto;
    }


    /**
	 * 设置：公开课照片
	 */
    public void setGongkaikePhoto(String gongkaikePhoto) {
        this.gongkaikePhoto = gongkaikePhoto;
    }
    /**
	 * 获取：公开课类型
	 */
    public Integer getGongkaikeTypes() {
        return gongkaikeTypes;
    }


    /**
	 * 设置：公开课类型
	 */
    public void setGongkaikeTypes(Integer gongkaikeTypes) {
        this.gongkaikeTypes = gongkaikeTypes;
    }
    /**
	 * 获取：公开课视频
	 */
    public String getGongkaikeVideo() {
        return gongkaikeVideo;
    }


    /**
	 * 设置：公开课视频
	 */
    public void setGongkaikeVideo(String gongkaikeVideo) {
        this.gongkaikeVideo = gongkaikeVideo;
    }
    /**
	 * 获取：公开课介绍
	 */
    public String getGongkaikeContent() {
        return gongkaikeContent;
    }


    /**
	 * 设置：公开课介绍
	 */
    public void setGongkaikeContent(String gongkaikeContent) {
        this.gongkaikeContent = gongkaikeContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
