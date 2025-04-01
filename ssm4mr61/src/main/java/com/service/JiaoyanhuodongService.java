package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoyanhuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoyanhuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoyanhuodongView;


/**
 * 教研活动
 *
 * @author 
 * @email 
 * @date 2021-05-17 22:22:47
 */
public interface JiaoyanhuodongService extends IService<JiaoyanhuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoyanhuodongVO> selectListVO(Wrapper<JiaoyanhuodongEntity> wrapper);
   	
   	JiaoyanhuodongVO selectVO(@Param("ew") Wrapper<JiaoyanhuodongEntity> wrapper);
   	
   	List<JiaoyanhuodongView> selectListView(Wrapper<JiaoyanhuodongEntity> wrapper);
   	
   	JiaoyanhuodongView selectView(@Param("ew") Wrapper<JiaoyanhuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoyanhuodongEntity> wrapper);
   	
}

