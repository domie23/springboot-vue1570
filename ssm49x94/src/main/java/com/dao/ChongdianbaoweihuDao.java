package com.dao;

import com.entity.ChongdianbaoweihuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongdianbaoweihuVO;
import com.entity.view.ChongdianbaoweihuView;


/**
 * 充电宝维护
 * 
 * @author 
 * @email 
 * @date 2021-03-20 21:03:48
 */
public interface ChongdianbaoweihuDao extends BaseMapper<ChongdianbaoweihuEntity> {
	
	List<ChongdianbaoweihuVO> selectListVO(@Param("ew") Wrapper<ChongdianbaoweihuEntity> wrapper);
	
	ChongdianbaoweihuVO selectVO(@Param("ew") Wrapper<ChongdianbaoweihuEntity> wrapper);
	
	List<ChongdianbaoweihuView> selectListView(@Param("ew") Wrapper<ChongdianbaoweihuEntity> wrapper);

	List<ChongdianbaoweihuView> selectListView(Pagination page,@Param("ew") Wrapper<ChongdianbaoweihuEntity> wrapper);
	
	ChongdianbaoweihuView selectView(@Param("ew") Wrapper<ChongdianbaoweihuEntity> wrapper);
	
}
