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


import com.dao.FeiyongdingdanDao;
import com.entity.FeiyongdingdanEntity;
import com.service.FeiyongdingdanService;
import com.entity.vo.FeiyongdingdanVO;
import com.entity.view.FeiyongdingdanView;

@Service("feiyongdingdanService")
public class FeiyongdingdanServiceImpl extends ServiceImpl<FeiyongdingdanDao, FeiyongdingdanEntity> implements FeiyongdingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FeiyongdingdanEntity> page = this.selectPage(
                new Query<FeiyongdingdanEntity>(params).getPage(),
                new EntityWrapper<FeiyongdingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FeiyongdingdanEntity> wrapper) {
		  Page<FeiyongdingdanView> page =new Query<FeiyongdingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FeiyongdingdanVO> selectListVO(Wrapper<FeiyongdingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FeiyongdingdanVO selectVO(Wrapper<FeiyongdingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FeiyongdingdanView> selectListView(Wrapper<FeiyongdingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FeiyongdingdanView selectView(Wrapper<FeiyongdingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
