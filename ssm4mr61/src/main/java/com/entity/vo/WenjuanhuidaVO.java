package com.entity.vo;

import com.entity.WenjuanhuidaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 问卷回答
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-17 22:22:47
 */
public class WenjuanhuidaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 课程名称
	 */
	
	private String kechengmingcheng;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 问卷名称
	 */
	
	private String wenjuanmingcheng;
		
	/**
	 * 问卷内容
	 */
	
	private String wenjuanneirong;
		
	/**
	 * 问卷回答
	 */
	
	private String wenjuanhuida;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
				
	
	/**
	 * 设置：课程名称
	 */
	 
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
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
	 * 设置：问卷名称
	 */
	 
	public void setWenjuanmingcheng(String wenjuanmingcheng) {
		this.wenjuanmingcheng = wenjuanmingcheng;
	}
	
	/**
	 * 获取：问卷名称
	 */
	public String getWenjuanmingcheng() {
		return wenjuanmingcheng;
	}
				
	
	/**
	 * 设置：问卷内容
	 */
	 
	public void setWenjuanneirong(String wenjuanneirong) {
		this.wenjuanneirong = wenjuanneirong;
	}
	
	/**
	 * 获取：问卷内容
	 */
	public String getWenjuanneirong() {
		return wenjuanneirong;
	}
				
	
	/**
	 * 设置：问卷回答
	 */
	 
	public void setWenjuanhuida(String wenjuanhuida) {
		this.wenjuanhuida = wenjuanhuida;
	}
	
	/**
	 * 获取：问卷回答
	 */
	public String getWenjuanhuida() {
		return wenjuanhuida;
	}
				
	
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
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
			
}
