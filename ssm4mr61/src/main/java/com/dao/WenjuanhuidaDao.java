package com.dao;

import com.entity.WenjuanhuidaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenjuanhuidaVO;
import com.entity.view.WenjuanhuidaView;


/**
 * 问卷回答
 * 
 * @author 
 * @email 
 * @date 2021-05-17 22:22:47
 */
public interface WenjuanhuidaDao extends BaseMapper<WenjuanhuidaEntity> {
	
	List<WenjuanhuidaVO> selectListVO(@Param("ew") Wrapper<WenjuanhuidaEntity> wrapper);
	
	WenjuanhuidaVO selectVO(@Param("ew") Wrapper<WenjuanhuidaEntity> wrapper);
	
	List<WenjuanhuidaView> selectListView(@Param("ew") Wrapper<WenjuanhuidaEntity> wrapper);

	List<WenjuanhuidaView> selectListView(Pagination page,@Param("ew") Wrapper<WenjuanhuidaEntity> wrapper);
	
	WenjuanhuidaView selectView(@Param("ew") Wrapper<WenjuanhuidaEntity> wrapper);
	
}
