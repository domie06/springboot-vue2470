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


import com.dao.KechengwenjuanDao;
import com.entity.KechengwenjuanEntity;
import com.service.KechengwenjuanService;
import com.entity.vo.KechengwenjuanVO;
import com.entity.view.KechengwenjuanView;

@Service("kechengwenjuanService")
public class KechengwenjuanServiceImpl extends ServiceImpl<KechengwenjuanDao, KechengwenjuanEntity> implements KechengwenjuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengwenjuanEntity> page = this.selectPage(
                new Query<KechengwenjuanEntity>(params).getPage(),
                new EntityWrapper<KechengwenjuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengwenjuanEntity> wrapper) {
		  Page<KechengwenjuanView> page =new Query<KechengwenjuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengwenjuanVO> selectListVO(Wrapper<KechengwenjuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengwenjuanVO selectVO(Wrapper<KechengwenjuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengwenjuanView> selectListView(Wrapper<KechengwenjuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengwenjuanView selectView(Wrapper<KechengwenjuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
