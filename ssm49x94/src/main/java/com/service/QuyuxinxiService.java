package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuyuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuyuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuyuxinxiView;


/**
 * 区域信息
 *
 * @author 
 * @email 
 * @date 2021-03-20 21:03:47
 */
public interface QuyuxinxiService extends IService<QuyuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuyuxinxiVO> selectListVO(Wrapper<QuyuxinxiEntity> wrapper);
   	
   	QuyuxinxiVO selectVO(@Param("ew") Wrapper<QuyuxinxiEntity> wrapper);
   	
   	List<QuyuxinxiView> selectListView(Wrapper<QuyuxinxiEntity> wrapper);
   	
   	QuyuxinxiView selectView(@Param("ew") Wrapper<QuyuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuyuxinxiEntity> wrapper);
   	
}

