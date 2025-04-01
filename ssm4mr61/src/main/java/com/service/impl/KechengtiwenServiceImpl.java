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


import com.dao.KechengtiwenDao;
import com.entity.KechengtiwenEntity;
import com.service.KechengtiwenService;
import com.entity.vo.KechengtiwenVO;
import com.entity.view.KechengtiwenView;

@Service("kechengtiwenService")
public class KechengtiwenServiceImpl extends ServiceImpl<KechengtiwenDao, KechengtiwenEntity> implements KechengtiwenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengtiwenEntity> page = this.selectPage(
                new Query<KechengtiwenEntity>(params).getPage(),
                new EntityWrapper<KechengtiwenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengtiwenEntity> wrapper) {
		  Page<KechengtiwenView> page =new Query<KechengtiwenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengtiwenVO> selectListVO(Wrapper<KechengtiwenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengtiwenVO selectVO(Wrapper<KechengtiwenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengtiwenView> selectListView(Wrapper<KechengtiwenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengtiwenView selectView(Wrapper<KechengtiwenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
