package com.entity.model;

import com.entity.ShizililiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 师资力量
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShizililiangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 老师姓名
     */
    private String shizililiangName;


    /**
     * 毕业学校
     */
    private String shizililiangXuexiao;


    /**
     * 教学年限
     */
    private String jiaoxuenianxian;


    /**
     * 擅长课程
     */
    private String shanchangkecheng;


    /**
     * 老师头像
     */
    private String shizililiangPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 详细介绍
     */
    private String shizililiangContent;


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
	 * 获取：老师姓名
	 */
    public String getShizililiangName() {
        return shizililiangName;
    }


    /**
	 * 设置：老师姓名
	 */
    public void setShizililiangName(String shizililiangName) {
        this.shizililiangName = shizililiangName;
    }
    /**
	 * 获取：毕业学校
	 */
    public String getShizililiangXuexiao() {
        return shizililiangXuexiao;
    }


    /**
	 * 设置：毕业学校
	 */
    public void setShizililiangXuexiao(String shizililiangXuexiao) {
        this.shizililiangXuexiao = shizililiangXuexiao;
    }
    /**
	 * 获取：教学年限
	 */
    public String getJiaoxuenianxian() {
        return jiaoxuenianxian;
    }


    /**
	 * 设置：教学年限
	 */
    public void setJiaoxuenianxian(String jiaoxuenianxian) {
        this.jiaoxuenianxian = jiaoxuenianxian;
    }
    /**
	 * 获取：擅长课程
	 */
    public String getShanchangkecheng() {
        return shanchangkecheng;
    }


    /**
	 * 设置：擅长课程
	 */
    public void setShanchangkecheng(String shanchangkecheng) {
        this.shanchangkecheng = shanchangkecheng;
    }
    /**
	 * 获取：老师头像
	 */
    public String getShizililiangPhoto() {
        return shizililiangPhoto;
    }


    /**
	 * 设置：老师头像
	 */
    public void setShizililiangPhoto(String shizililiangPhoto) {
        this.shizililiangPhoto = shizililiangPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：详细介绍
	 */
    public String getShizililiangContent() {
        return shizililiangContent;
    }


    /**
	 * 设置：详细介绍
	 */
    public void setShizililiangContent(String shizililiangContent) {
        this.shizililiangContent = shizililiangContent;
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
