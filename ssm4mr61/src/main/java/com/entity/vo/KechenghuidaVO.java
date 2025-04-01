package com.entity.vo;

import com.entity.KechenghuidaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 课程回答
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-17 22:22:47
 */
public class KechenghuidaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 提问内容
	 */
	
	private String tiwenneirong;
		
	/**
	 * 回答内容
	 */
	
	private String huidaneirong;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：提问内容
	 */
	 
	public void setTiwenneirong(String tiwenneirong) {
		this.tiwenneirong = tiwenneirong;
	}
	
	/**
	 * 获取：提问内容
	 */
	public String getTiwenneirong() {
		return tiwenneirong;
	}
				
	
	/**
	 * 设置：回答内容
	 */
	 
	public void setHuidaneirong(String huidaneirong) {
		this.huidaneirong = huidaneirong;
	}
	
	/**
	 * 获取：回答内容
	 */
	public String getHuidaneirong() {
		return huidaneirong;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
			
}
