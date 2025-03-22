package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuihaidingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuihaidingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuihaidingdanView;


/**
 * 归还订单
 *
 * @author 
 * @email 
 * @date 2021-03-20 21:03:47
 */
public interface GuihaidingdanService extends IService<GuihaidingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuihaidingdanVO> selectListVO(Wrapper<GuihaidingdanEntity> wrapper);
   	
   	GuihaidingdanVO selectVO(@Param("ew") Wrapper<GuihaidingdanEntity> wrapper);
   	
   	List<GuihaidingdanView> selectListView(Wrapper<GuihaidingdanEntity> wrapper);
   	
   	GuihaidingdanView selectView(@Param("ew") Wrapper<GuihaidingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuihaidingdanEntity> wrapper);
   	
}

