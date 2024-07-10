package com.entity.vo;

import com.entity.ShizililiangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 师资力量
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shizililiang")
public class ShizililiangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 老师姓名
     */

    @TableField(value = "shizililiang_name")
    private String shizililiangName;


    /**
     * 毕业学校
     */

    @TableField(value = "shizililiang_xuexiao")
    private String shizililiangXuexiao;


    /**
     * 教学年限
     */

    @TableField(value = "jiaoxuenianxian")
    private String jiaoxuenianxian;


    /**
     * 擅长课程
     */

    @TableField(value = "shanchangkecheng")
    private String shanchangkecheng;


    /**
     * 老师头像
     */

    @TableField(value = "shizililiang_photo")
    private String shizililiangPhoto;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 详细介绍
     */

    @TableField(value = "shizililiang_content")
    private String shizililiangContent;


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
	 * 设置：老师姓名
	 */
    public String getShizililiangName() {
        return shizililiangName;
    }


    /**
	 * 获取：老师姓名
	 */

    public void setShizililiangName(String shizililiangName) {
        this.shizililiangName = shizililiangName;
    }
    /**
	 * 设置：毕业学校
	 */
    public String getShizililiangXuexiao() {
        return shizililiangXuexiao;
    }


    /**
	 * 获取：毕业学校
	 */

    public void setShizililiangXuexiao(String shizililiangXuexiao) {
        this.shizililiangXuexiao = shizililiangXuexiao;
    }
    /**
	 * 设置：教学年限
	 */
    public String getJiaoxuenianxian() {
        return jiaoxuenianxian;
    }


    /**
	 * 获取：教学年限
	 */

    public void setJiaoxuenianxian(String jiaoxuenianxian) {
        this.jiaoxuenianxian = jiaoxuenianxian;
    }
    /**
	 * 设置：擅长课程
	 */
    public String getShanchangkecheng() {
        return shanchangkecheng;
    }


    /**
	 * 获取：擅长课程
	 */

    public void setShanchangkecheng(String shanchangkecheng) {
        this.shanchangkecheng = shanchangkecheng;
    }
    /**
	 * 设置：老师头像
	 */
    public String getShizililiangPhoto() {
        return shizililiangPhoto;
    }


    /**
	 * 获取：老师头像
	 */

    public void setShizililiangPhoto(String shizililiangPhoto) {
        this.shizililiangPhoto = shizililiangPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：详细介绍
	 */
    public String getShizililiangContent() {
        return shizililiangContent;
    }


    /**
	 * 获取：详细介绍
	 */

    public void setShizililiangContent(String shizililiangContent) {
        this.shizililiangContent = shizililiangContent;
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
