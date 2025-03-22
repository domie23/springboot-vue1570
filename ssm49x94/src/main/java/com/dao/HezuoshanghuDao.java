package com.dao;

import com.entity.HezuoshanghuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HezuoshanghuVO;
import com.entity.view.HezuoshanghuView;


/**
 * 合作商户
 * 
 * @author 
 * @email 
 * @date 2021-03-20 21:03:47
 */
public interface HezuoshanghuDao extends BaseMapper<HezuoshanghuEntity> {
	
	List<HezuoshanghuVO> selectListVO(@Param("ew") Wrapper<HezuoshanghuEntity> wrapper);
	
	HezuoshanghuVO selectVO(@Param("ew") Wrapper<HezuoshanghuEntity> wrapper);
	
	List<HezuoshanghuView> selectListView(@Param("ew") Wrapper<HezuoshanghuEntity> wrapper);

	List<HezuoshanghuView> selectListView(Pagination page,@Param("ew") Wrapper<HezuoshanghuEntity> wrapper);
	
	HezuoshanghuView selectView(@Param("ew") Wrapper<HezuoshanghuEntity> wrapper);
	
}
