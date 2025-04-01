package com.dao;

import com.entity.JiaoyanhuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoyanhuodongVO;
import com.entity.view.JiaoyanhuodongView;


/**
 * 教研活动
 * 
 * @author 
 * @email 
 * @date 2021-05-17 22:22:47
 */
public interface JiaoyanhuodongDao extends BaseMapper<JiaoyanhuodongEntity> {
	
	List<JiaoyanhuodongVO> selectListVO(@Param("ew") Wrapper<JiaoyanhuodongEntity> wrapper);
	
	JiaoyanhuodongVO selectVO(@Param("ew") Wrapper<JiaoyanhuodongEntity> wrapper);
	
	List<JiaoyanhuodongView> selectListView(@Param("ew") Wrapper<JiaoyanhuodongEntity> wrapper);

	List<JiaoyanhuodongView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoyanhuodongEntity> wrapper);
	
	JiaoyanhuodongView selectView(@Param("ew") Wrapper<JiaoyanhuodongEntity> wrapper);
	
}
