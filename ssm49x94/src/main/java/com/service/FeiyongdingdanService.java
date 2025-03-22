package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FeiyongdingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FeiyongdingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FeiyongdingdanView;


/**
 * 费用订单
 *
 * @author 
 * @email 
 * @date 2021-03-20 21:03:47
 */
public interface FeiyongdingdanService extends IService<FeiyongdingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FeiyongdingdanVO> selectListVO(Wrapper<FeiyongdingdanEntity> wrapper);
   	
   	FeiyongdingdanVO selectVO(@Param("ew") Wrapper<FeiyongdingdanEntity> wrapper);
   	
   	List<FeiyongdingdanView> selectListView(Wrapper<FeiyongdingdanEntity> wrapper);
   	
   	FeiyongdingdanView selectView(@Param("ew") Wrapper<FeiyongdingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FeiyongdingdanEntity> wrapper);
   	
}

