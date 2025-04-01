package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengtiwenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengtiwenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengtiwenView;


/**
 * 课程提问
 *
 * @author 
 * @email 
 * @date 2021-05-17 22:22:47
 */
public interface KechengtiwenService extends IService<KechengtiwenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengtiwenVO> selectListVO(Wrapper<KechengtiwenEntity> wrapper);
   	
   	KechengtiwenVO selectVO(@Param("ew") Wrapper<KechengtiwenEntity> wrapper);
   	
   	List<KechengtiwenView> selectListView(Wrapper<KechengtiwenEntity> wrapper);
   	
   	KechengtiwenView selectView(@Param("ew") Wrapper<KechengtiwenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengtiwenEntity> wrapper);
   	
}

