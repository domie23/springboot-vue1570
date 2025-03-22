package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HezuoshanghuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HezuoshanghuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HezuoshanghuView;


/**
 * 合作商户
 *
 * @author 
 * @email 
 * @date 2021-03-20 21:03:47
 */
public interface HezuoshanghuService extends IService<HezuoshanghuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HezuoshanghuVO> selectListVO(Wrapper<HezuoshanghuEntity> wrapper);
   	
   	HezuoshanghuVO selectVO(@Param("ew") Wrapper<HezuoshanghuEntity> wrapper);
   	
   	List<HezuoshanghuView> selectListView(Wrapper<HezuoshanghuEntity> wrapper);
   	
   	HezuoshanghuView selectView(@Param("ew") Wrapper<HezuoshanghuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HezuoshanghuEntity> wrapper);
   	
}

