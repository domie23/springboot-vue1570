package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeihurenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeihurenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeihurenyuanView;


/**
 * 维护人员
 *
 * @author 
 * @email 
 * @date 2021-03-20 21:03:47
 */
public interface WeihurenyuanService extends IService<WeihurenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeihurenyuanVO> selectListVO(Wrapper<WeihurenyuanEntity> wrapper);
   	
   	WeihurenyuanVO selectVO(@Param("ew") Wrapper<WeihurenyuanEntity> wrapper);
   	
   	List<WeihurenyuanView> selectListView(Wrapper<WeihurenyuanEntity> wrapper);
   	
   	WeihurenyuanView selectView(@Param("ew") Wrapper<WeihurenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeihurenyuanEntity> wrapper);
   	
}

