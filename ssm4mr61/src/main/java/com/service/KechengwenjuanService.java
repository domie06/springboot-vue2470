package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengwenjuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengwenjuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengwenjuanView;


/**
 * 课程问卷
 *
 * @author 
 * @email 
 * @date 2021-05-17 22:22:47
 */
public interface KechengwenjuanService extends IService<KechengwenjuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengwenjuanVO> selectListVO(Wrapper<KechengwenjuanEntity> wrapper);
   	
   	KechengwenjuanVO selectVO(@Param("ew") Wrapper<KechengwenjuanEntity> wrapper);
   	
   	List<KechengwenjuanView> selectListView(Wrapper<KechengwenjuanEntity> wrapper);
   	
   	KechengwenjuanView selectView(@Param("ew") Wrapper<KechengwenjuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengwenjuanEntity> wrapper);
   	
}

