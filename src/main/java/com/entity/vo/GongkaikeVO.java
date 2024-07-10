package com.entity.vo;

import com.entity.GongkaikeEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 公开课
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gongkaike")
public class GongkaikeVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
