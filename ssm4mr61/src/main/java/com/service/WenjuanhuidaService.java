package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenjuanhuidaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenjuanhuidaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenjuanhuidaView;


/**
 * 问卷回答
 *
 * @author 
 * @email 
 * @date 2021-05-17 22:22:47
 */
public interface WenjuanhuidaService extends IService<WenjuanhuidaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenjuanhuidaVO> selectListVO(Wrapper<WenjuanhuidaEntity> wrapper);
   	
   	WenjuanhuidaVO selectVO(@Param("ew") Wrapper<WenjuanhuidaEntity> wrapper);
   	
   	List<WenjuanhuidaView> selectListView(Wrapper<WenjuanhuidaEntity> wrapper);
   	
   	WenjuanhuidaView selectView(@Param("ew") Wrapper<WenjuanhuidaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenjuanhuidaEntity> wrapper);
   	
}

