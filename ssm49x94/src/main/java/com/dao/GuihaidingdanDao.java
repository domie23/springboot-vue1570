package com.dao;

import com.entity.GuihaidingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuihaidingdanVO;
import com.entity.view.GuihaidingdanView;


/**
 * 归还订单
 * 
 * @author 
 * @email 
 * @date 2021-03-20 21:03:47
 */
public interface GuihaidingdanDao extends BaseMapper<GuihaidingdanEntity> {
	
	List<GuihaidingdanVO> selectListVO(@Param("ew") Wrapper<GuihaidingdanEntity> wrapper);
	
	GuihaidingdanVO selectVO(@Param("ew") Wrapper<GuihaidingdanEntity> wrapper);
	
	List<GuihaidingdanView> selectListView(@Param("ew") Wrapper<GuihaidingdanEntity> wrapper);

	List<GuihaidingdanView> selectListView(Pagination page,@Param("ew") Wrapper<GuihaidingdanEntity> wrapper);
	
	GuihaidingdanView selectView(@Param("ew") Wrapper<GuihaidingdanEntity> wrapper);
	
}
