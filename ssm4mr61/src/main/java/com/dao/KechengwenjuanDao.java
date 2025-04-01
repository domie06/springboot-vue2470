package com.dao;

import com.entity.KechengwenjuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengwenjuanVO;
import com.entity.view.KechengwenjuanView;


/**
 * 课程问卷
 * 
 * @author 
 * @email 
 * @date 2021-05-17 22:22:47
 */
public interface KechengwenjuanDao extends BaseMapper<KechengwenjuanEntity> {
	
	List<KechengwenjuanVO> selectListVO(@Param("ew") Wrapper<KechengwenjuanEntity> wrapper);
	
	KechengwenjuanVO selectVO(@Param("ew") Wrapper<KechengwenjuanEntity> wrapper);
	
	List<KechengwenjuanView> selectListView(@Param("ew") Wrapper<KechengwenjuanEntity> wrapper);

	List<KechengwenjuanView> selectListView(Pagination page,@Param("ew") Wrapper<KechengwenjuanEntity> wrapper);
	
	KechengwenjuanView selectView(@Param("ew") Wrapper<KechengwenjuanEntity> wrapper);
	
}
