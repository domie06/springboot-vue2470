package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechenghuidaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechenghuidaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechenghuidaView;


/**
 * 课程回答
 *
 * @author 
 * @email 
 * @date 2021-05-17 22:22:47
 */
public interface KechenghuidaService extends IService<KechenghuidaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechenghuidaVO> selectListVO(Wrapper<KechenghuidaEntity> wrapper);
   	
   	KechenghuidaVO selectVO(@Param("ew") Wrapper<KechenghuidaEntity> wrapper);
   	
   	List<KechenghuidaView> selectListView(Wrapper<KechenghuidaEntity> wrapper);
   	
   	KechenghuidaView selectView(@Param("ew") Wrapper<KechenghuidaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechenghuidaEntity> wrapper);
   	
}

