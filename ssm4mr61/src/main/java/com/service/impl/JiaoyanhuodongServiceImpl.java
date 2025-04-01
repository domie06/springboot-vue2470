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


import com.dao.JiaoyanhuodongDao;
import com.entity.JiaoyanhuodongEntity;
import com.service.JiaoyanhuodongService;
import com.entity.vo.JiaoyanhuodongVO;
import com.entity.view.JiaoyanhuodongView;

@Service("jiaoyanhuodongService")
public class JiaoyanhuodongServiceImpl extends ServiceImpl<JiaoyanhuodongDao, JiaoyanhuodongEntity> implements JiaoyanhuodongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoyanhuodongEntity> page = this.selectPage(
                new Query<JiaoyanhuodongEntity>(params).getPage(),
                new EntityWrapper<JiaoyanhuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoyanhuodongEntity> wrapper) {
		  Page<JiaoyanhuodongView> page =new Query<JiaoyanhuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoyanhuodongVO> selectListVO(Wrapper<JiaoyanhuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoyanhuodongVO selectVO(Wrapper<JiaoyanhuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoyanhuodongView> selectListView(Wrapper<JiaoyanhuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoyanhuodongView selectView(Wrapper<JiaoyanhuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
