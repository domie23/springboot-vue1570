package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongdianbaotoufangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongdianbaotoufangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongdianbaotoufangView;


/**
 * 充电宝投放
 *
 * @author 
 * @email 
 * @date 2021-03-20 21:03:47
 */
public interface ChongdianbaotoufangService extends IService<ChongdianbaotoufangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongdianbaotoufangVO> selectListVO(Wrapper<ChongdianbaotoufangEntity> wrapper);
   	
   	ChongdianbaotoufangVO selectVO(@Param("ew") Wrapper<ChongdianbaotoufangEntity> wrapper);
   	
   	List<ChongdianbaotoufangView> selectListView(Wrapper<ChongdianbaotoufangEntity> wrapper);
   	
   	ChongdianbaotoufangView selectView(@Param("ew") Wrapper<ChongdianbaotoufangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongdianbaotoufangEntity> wrapper);
   	
}

