package com.entity.view;

import com.entity.KechengBaomingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 课程报名
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kecheng_baoming")
public class KechengBaomingView extends KechengBaomingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 状态的值
		*/
		private String kechengBaomingYesnoValue;



		//级联表 kecheng
			/**
			* 课程名称
			*/
			private String kechengName;
			/**
			* 课程照片
			*/
			private String kechengPhoto;
			/**
			* 课程类型
			*/
			private Integer kechengTypes;
				/**
				* 课程类型的值
				*/
				private String kechengValue;
			/**
			* 上课老师
			*/
			private String kechengLaoshi;
			/**
			* 开课日期
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
			@DateTimeFormat
			private Date kaikeTime;
			/**
			* 上课时间
			*/
			private String shangkeShijian;
			/**
			* 点击次数
			*/
			private Integer kechengClicknum;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer kechengDelete;
			/**
			* 课程介绍
			*/
			private String kechengContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public KechengBaomingView() {

	}

	public KechengBaomingView(KechengBaomingEntity kechengBaomingEntity) {
		try {
			BeanUtils.copyProperties(this, kechengBaomingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 状态的值
			*/
			public String getKechengBaomingYesnoValue() {
				return kechengBaomingYesnoValue;
			}
			/**
			* 设置： 状态的值
			*/
			public void setKechengBaomingYesnoValue(String kechengBaomingYesnoValue) {
				this.kechengBaomingYesnoValue = kechengBaomingYesnoValue;
			}













				//级联表的get和set kecheng
					/**
					* 获取： 课程名称
					*/
					public String getKechengName() {
						return kechengName;
					}
					/**
					* 设置： 课程名称
					*/
					public void setKechengName(String kechengName) {
						this.kechengName = kechengName;
					}
					/**
					* 获取： 课程照片
					*/
					public String getKechengPhoto() {
						return kechengPhoto;
					}
					/**
					* 设置： 课程照片
					*/
					public void setKechengPhoto(String kechengPhoto) {
						this.kechengPhoto = kechengPhoto;
					}
					/**
					* 获取： 课程类型
					*/
					public Integer getKechengTypes() {
						return kechengTypes;
					}
					/**
					* 设置： 课程类型
					*/
					public void setKechengTypes(Integer kechengTypes) {
						this.kechengTypes = kechengTypes;
					}


						/**
						* 获取： 课程类型的值
						*/
						public String getKechengValue() {
							return kechengValue;
						}
						/**
						* 设置： 课程类型的值
						*/
						public void setKechengValue(String kechengValue) {
							this.kechengValue = kechengValue;
						}
					/**
					* 获取： 上课老师
					*/
					public String getKechengLaoshi() {
						return kechengLaoshi;
					}
					/**
					* 设置： 上课老师
					*/
					public void setKechengLaoshi(String kechengLaoshi) {
						this.kechengLaoshi = kechengLaoshi;
					}
					/**
					* 获取： 开课日期
					*/
					public Date getKaikeTime() {
						return kaikeTime;
					}
					/**
					* 设置： 开课日期
					*/
					public void setKaikeTime(Date kaikeTime) {
						this.kaikeTime = kaikeTime;
					}
					/**
					* 获取： 上课时间
					*/
					public String getShangkeShijian() {
						return shangkeShijian;
					}
					/**
					* 设置： 上课时间
					*/
					public void setShangkeShijian(String shangkeShijian) {
						this.shangkeShijian = shangkeShijian;
					}
					/**
					* 获取： 点击次数
					*/
					public Integer getKechengClicknum() {
						return kechengClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setKechengClicknum(Integer kechengClicknum) {
						this.kechengClicknum = kechengClicknum;
					}
					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}
					/**
					* 获取： 逻辑删除
					*/
					public Integer getKechengDelete() {
						return kechengDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setKechengDelete(Integer kechengDelete) {
						this.kechengDelete = kechengDelete;
					}
					/**
					* 获取： 课程介绍
					*/
					public String getKechengContent() {
						return kechengContent;
					}
					/**
					* 设置： 课程介绍
					*/
					public void setKechengContent(String kechengContent) {
						this.kechengContent = kechengContent;
					}
















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}



}
