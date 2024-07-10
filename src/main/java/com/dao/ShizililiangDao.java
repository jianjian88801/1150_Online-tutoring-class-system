package com.dao;

import com.entity.ShizililiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShizililiangView;

/**
 * 师资力量 Dao 接口
 *
 * @author 
 */
public interface ShizililiangDao extends BaseMapper<ShizililiangEntity> {

   List<ShizililiangView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
