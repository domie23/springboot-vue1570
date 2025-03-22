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


import com.dao.ChongdianbaotoufangDao;
import com.entity.ChongdianbaotoufangEntity;
import com.service.ChongdianbaotoufangService;
import com.entity.vo.ChongdianbaotoufangVO;
import com.entity.view.ChongdianbaotoufangView;

@Service("chongdianbaotoufangService")
public class ChongdianbaotoufangServiceImpl extends ServiceImpl<ChongdianbaotoufangDao, ChongdianbaotoufangEntity> implements ChongdianbaotoufangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongdianbaotoufangEntity> page = this.selectPage(
                new Query<ChongdianbaotoufangEntity>(params).getPage(),
                new EntityWrapper<ChongdianbaotoufangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongdianbaotoufangEntity> wrapper) {
		  Page<ChongdianbaotoufangView> page =new Query<ChongdianbaotoufangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongdianbaotoufangVO> selectListVO(Wrapper<ChongdianbaotoufangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongdianbaotoufangVO selectVO(Wrapper<ChongdianbaotoufangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongdianbaotoufangView> selectListView(Wrapper<ChongdianbaotoufangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongdianbaotoufangView selectView(Wrapper<ChongdianbaotoufangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
