package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.HezuoshanghuDao;
import com.entity.HezuoshanghuEntity;
import com.service.HezuoshanghuService;
import com.entity.vo.HezuoshanghuVO;
import com.entity.view.HezuoshanghuView;

@Service("hezuoshanghuService")
public class HezuoshanghuServiceImpl extends ServiceImpl<HezuoshanghuDao, HezuoshanghuEntity> implements HezuoshanghuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HezuoshanghuEntity> page = this.selectPage(
                new Query<HezuoshanghuEntity>(params).getPage(),
                new EntityWrapper<HezuoshanghuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HezuoshanghuEntity> wrapper) {
		  Page<HezuoshanghuView> page =new Query<HezuoshanghuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HezuoshanghuVO> selectListVO(Wrapper<HezuoshanghuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HezuoshanghuVO selectVO(Wrapper<HezuoshanghuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HezuoshanghuView> selectListView(Wrapper<HezuoshanghuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HezuoshanghuView selectView(Wrapper<HezuoshanghuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
