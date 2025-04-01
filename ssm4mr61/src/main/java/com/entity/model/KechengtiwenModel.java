package com.entity.model;

import com.entity.KechengtiwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 课程提问
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-17 22:22:47
 */
public class KechengtiwenModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 提问内容
	 */
	
	private String tiwenneirong;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 提问日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tiwenriqi;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
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
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
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
				
	
	/**
	 * 设置：提问日期
	 */
	 
	public void setTiwenriqi(Date tiwenriqi) {
		this.tiwenriqi = tiwenriqi;
	}
	
	/**
	 * 获取：提问日期
	 */
	public Date getTiwenriqi() {
		return tiwenriqi;
	}
			
}
