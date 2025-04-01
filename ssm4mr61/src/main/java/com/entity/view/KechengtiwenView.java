package com.entity.view;

import com.entity.KechengtiwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程提问
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-17 22:22:47
 */
@TableName("kechengtiwen")
public class KechengtiwenView  extends KechengtiwenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KechengtiwenView(){
	}
 
 	public KechengtiwenView(KechengtiwenEntity kechengtiwenEntity){
 	try {
			BeanUtils.copyProperties(this, kechengtiwenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
