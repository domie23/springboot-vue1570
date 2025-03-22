package com.dao;

import com.entity.FeiyongdingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FeiyongdingdanVO;
import com.entity.view.FeiyongdingdanView;


/**
 * 费用订单
 * 
 * @author 
 * @email 
 * @date 2021-03-20 21:03:47
 */
public interface FeiyongdingdanDao extends BaseMapper<FeiyongdingdanEntity> {
	
	List<FeiyongdingdanVO> selectListVO(@Param("ew") Wrapper<FeiyongdingdanEntity> wrapper);
	
	FeiyongdingdanVO selectVO(@Param("ew") Wrapper<FeiyongdingdanEntity> wrapper);
	
	List<FeiyongdingdanView> selectListView(@Param("ew") Wrapper<FeiyongdingdanEntity> wrapper);

	List<FeiyongdingdanView> selectListView(Pagination page,@Param("ew") Wrapper<FeiyongdingdanEntity> wrapper);
	
	FeiyongdingdanView selectView(@Param("ew") Wrapper<FeiyongdingdanEntity> wrapper);
	
}
