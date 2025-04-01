package com.dao;

import com.entity.KechenghuidaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechenghuidaVO;
import com.entity.view.KechenghuidaView;


/**
 * 课程回答
 * 
 * @author 
 * @email 
 * @date 2021-05-17 22:22:47
 */
public interface KechenghuidaDao extends BaseMapper<KechenghuidaEntity> {
	
	List<KechenghuidaVO> selectListVO(@Param("ew") Wrapper<KechenghuidaEntity> wrapper);
	
	KechenghuidaVO selectVO(@Param("ew") Wrapper<KechenghuidaEntity> wrapper);
	
	List<KechenghuidaView> selectListView(@Param("ew") Wrapper<KechenghuidaEntity> wrapper);

	List<KechenghuidaView> selectListView(Pagination page,@Param("ew") Wrapper<KechenghuidaEntity> wrapper);
	
	KechenghuidaView selectView(@Param("ew") Wrapper<KechenghuidaEntity> wrapper);
	
}
