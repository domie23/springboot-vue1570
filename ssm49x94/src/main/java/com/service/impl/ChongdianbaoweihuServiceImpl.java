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


import com.dao.ChongdianbaoweihuDao;
import com.entity.ChongdianbaoweihuEntity;
import com.service.ChongdianbaoweihuService;
import com.entity.vo.ChongdianbaoweihuVO;
import com.entity.view.ChongdianbaoweihuView;

@Service("chongdianbaoweihuService")
public class ChongdianbaoweihuServiceImpl extends ServiceImpl<ChongdianbaoweihuDao, ChongdianbaoweihuEntity> implements ChongdianbaoweihuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongdianbaoweihuEntity> page = this.selectPage(
                new Query<ChongdianbaoweihuEntity>(params).getPage(),
                new EntityWrapper<ChongdianbaoweihuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongdianbaoweihuEntity> wrapper) {
		  Page<ChongdianbaoweihuView> page =new Query<ChongdianbaoweihuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongdianbaoweihuVO> selectListVO(Wrapper<ChongdianbaoweihuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongdianbaoweihuVO selectVO(Wrapper<ChongdianbaoweihuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongdianbaoweihuView> selectListView(Wrapper<ChongdianbaoweihuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongdianbaoweihuView selectView(Wrapper<ChongdianbaoweihuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
