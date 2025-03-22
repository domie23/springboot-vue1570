package com.dao;

import com.entity.ChongdianbaotoufangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongdianbaotoufangVO;
import com.entity.view.ChongdianbaotoufangView;


/**
 * 充电宝投放
 * 
 * @author 
 * @email 
 * @date 2021-03-20 21:03:47
 */
public interface ChongdianbaotoufangDao extends BaseMapper<ChongdianbaotoufangEntity> {
	
	List<ChongdianbaotoufangVO> selectListVO(@Param("ew") Wrapper<ChongdianbaotoufangEntity> wrapper);
	
	ChongdianbaotoufangVO selectVO(@Param("ew") Wrapper<ChongdianbaotoufangEntity> wrapper);
	
	List<ChongdianbaotoufangView> selectListView(@Param("ew") Wrapper<ChongdianbaotoufangEntity> wrapper);

	List<ChongdianbaotoufangView> selectListView(Pagination page,@Param("ew") Wrapper<ChongdianbaotoufangEntity> wrapper);
	
	ChongdianbaotoufangView selectView(@Param("ew") Wrapper<ChongdianbaotoufangEntity> wrapper);
	
}
