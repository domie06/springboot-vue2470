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


import com.dao.KechenghuidaDao;
import com.entity.KechenghuidaEntity;
import com.service.KechenghuidaService;
import com.entity.vo.KechenghuidaVO;
import com.entity.view.KechenghuidaView;

@Service("kechenghuidaService")
public class KechenghuidaServiceImpl extends ServiceImpl<KechenghuidaDao, KechenghuidaEntity> implements KechenghuidaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechenghuidaEntity> page = this.selectPage(
                new Query<KechenghuidaEntity>(params).getPage(),
                new EntityWrapper<KechenghuidaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechenghuidaEntity> wrapper) {
		  Page<KechenghuidaView> page =new Query<KechenghuidaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechenghuidaVO> selectListVO(Wrapper<KechenghuidaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechenghuidaVO selectVO(Wrapper<KechenghuidaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechenghuidaView> selectListView(Wrapper<KechenghuidaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechenghuidaView selectView(Wrapper<KechenghuidaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
