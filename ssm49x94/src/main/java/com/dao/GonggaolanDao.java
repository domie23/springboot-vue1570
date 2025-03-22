package com.dao;

import com.entity.GonggaolanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GonggaolanVO;
import com.entity.view.GonggaolanView;


/**
 * 公告栏
 * 
 * @author 
 * @email 
 * @date 2021-03-20 21:03:48
 */
public interface GonggaolanDao extends BaseMapper<GonggaolanEntity> {
	
	List<GonggaolanVO> selectListVO(@Param("ew") Wrapper<GonggaolanEntity> wrapper);
	
	GonggaolanVO selectVO(@Param("ew") Wrapper<GonggaolanEntity> wrapper);
	
	List<GonggaolanView> selectListView(@Param("ew") Wrapper<GonggaolanEntity> wrapper);

	List<GonggaolanView> selectListView(Pagination page,@Param("ew") Wrapper<GonggaolanEntity> wrapper);
	
	GonggaolanView selectView(@Param("ew") Wrapper<GonggaolanEntity> wrapper);
	
}
