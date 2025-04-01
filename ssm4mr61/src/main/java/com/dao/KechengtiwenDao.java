package com.dao;

import com.entity.KechengtiwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengtiwenVO;
import com.entity.view.KechengtiwenView;


/**
 * 课程提问
 * 
 * @author 
 * @email 
 * @date 2021-05-17 22:22:47
 */
public interface KechengtiwenDao extends BaseMapper<KechengtiwenEntity> {
	
	List<KechengtiwenVO> selectListVO(@Param("ew") Wrapper<KechengtiwenEntity> wrapper);
	
	KechengtiwenVO selectVO(@Param("ew") Wrapper<KechengtiwenEntity> wrapper);
	
	List<KechengtiwenView> selectListView(@Param("ew") Wrapper<KechengtiwenEntity> wrapper);

	List<KechengtiwenView> selectListView(Pagination page,@Param("ew") Wrapper<KechengtiwenEntity> wrapper);
	
	KechengtiwenView selectView(@Param("ew") Wrapper<KechengtiwenEntity> wrapper);
	
}
