package com.entity.view;

import com.entity.GongkaikeEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 公开课
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gongkaike")
public class GongkaikeView extends GongkaikeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 公开课类型的值
		*/
		private String gongkaikeValue;



	public GongkaikeView() {

	}

	public GongkaikeView(GongkaikeEntity gongkaikeEntity) {
		try {
			BeanUtils.copyProperties(this, gongkaikeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 公开课类型的值
			*/
			public String getGongkaikeValue() {
				return gongkaikeValue;
			}
			/**
			* 设置： 公开课类型的值
			*/
			public void setGongkaikeValue(String gongkaikeValue) {
				this.gongkaikeValue = gongkaikeValue;
			}












}
