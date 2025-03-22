package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongdianbaoweihuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongdianbaoweihuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongdianbaoweihuView;


/**
 * 充电宝维护
 *
 * @author 
 * @email 
 * @date 2021-03-20 21:03:48
 */
public interface ChongdianbaoweihuService extends IService<ChongdianbaoweihuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongdianbaoweihuVO> selectListVO(Wrapper<ChongdianbaoweihuEntity> wrapper);
   	
   	ChongdianbaoweihuVO selectVO(@Param("ew") Wrapper<ChongdianbaoweihuEntity> wrapper);
   	
   	List<ChongdianbaoweihuView> selectListView(Wrapper<ChongdianbaoweihuEntity> wrapper);
   	
   	ChongdianbaoweihuView selectView(@Param("ew") Wrapper<ChongdianbaoweihuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongdianbaoweihuEntity> wrapper);
   	
}

