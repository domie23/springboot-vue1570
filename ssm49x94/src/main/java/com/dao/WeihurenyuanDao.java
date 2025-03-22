package com.dao;

import com.entity.WeihurenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeihurenyuanVO;
import com.entity.view.WeihurenyuanView;


/**
 * 维护人员
 * 
 * @author 
 * @email 
 * @date 2021-03-20 21:03:47
 */
public interface WeihurenyuanDao extends BaseMapper<WeihurenyuanEntity> {
	
	List<WeihurenyuanVO> selectListVO(@Param("ew") Wrapper<WeihurenyuanEntity> wrapper);
	
	WeihurenyuanVO selectVO(@Param("ew") Wrapper<WeihurenyuanEntity> wrapper);
	
	List<WeihurenyuanView> selectListView(@Param("ew") Wrapper<WeihurenyuanEntity> wrapper);

	List<WeihurenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<WeihurenyuanEntity> wrapper);
	
	WeihurenyuanView selectView(@Param("ew") Wrapper<WeihurenyuanEntity> wrapper);
	
}
