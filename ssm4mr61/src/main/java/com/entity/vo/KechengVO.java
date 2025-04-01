package com.entity.vo;

import com.entity.KechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 课程
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-17 22:22:47
 */
public class KechengVO  implements Serializable {
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
	 * 课时数
	 */
	
	private String keshishu;
		
	/**
	 * 老师工号
	 */
	
	private String laoshigonghao;
		
	/**
	 * 老师姓名
	 */
	
	private String laoshixingming;
		
	/**
	 * 课程封面
	 */
	
	private String kechengfengmian;
		
	/**
	 * 课程视频
	 */
	
	private String kechengshipin;
		
	/**
	 * 课程资源
	 */
	
	private String kechengziyuan;
		
	/**
	 * 课程详情
	 */
	
	private String kechengxiangqing;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
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
	 * 设置：课时数
	 */
	 
	public void setKeshishu(String keshishu) {
		this.keshishu = keshishu;
	}
	
	/**
	 * 获取：课时数
	 */
	public String getKeshishu() {
		return keshishu;
	}
				
	
	/**
	 * 设置：老师工号
	 */
	 
	public void setLaoshigonghao(String laoshigonghao) {
		this.laoshigonghao = laoshigonghao;
	}
	
	/**
	 * 获取：老师工号
	 */
	public String getLaoshigonghao() {
		return laoshigonghao;
	}
				
	
	/**
	 * 设置：老师姓名
	 */
	 
	public void setLaoshixingming(String laoshixingming) {
		this.laoshixingming = laoshixingming;
	}
	
	/**
	 * 获取：老师姓名
	 */
	public String getLaoshixingming() {
		return laoshixingming;
	}
				
	
	/**
	 * 设置：课程封面
	 */
	 
	public void setKechengfengmian(String kechengfengmian) {
		this.kechengfengmian = kechengfengmian;
	}
	
	/**
	 * 获取：课程封面
	 */
	public String getKechengfengmian() {
		return kechengfengmian;
	}
				
	
	/**
	 * 设置：课程视频
	 */
	 
	public void setKechengshipin(String kechengshipin) {
		this.kechengshipin = kechengshipin;
	}
	
	/**
	 * 获取：课程视频
	 */
	public String getKechengshipin() {
		return kechengshipin;
	}
				
	
	/**
	 * 设置：课程资源
	 */
	 
	public void setKechengziyuan(String kechengziyuan) {
		this.kechengziyuan = kechengziyuan;
	}
	
	/**
	 * 获取：课程资源
	 */
	public String getKechengziyuan() {
		return kechengziyuan;
	}
				
	
	/**
	 * 设置：课程详情
	 */
	 
	public void setKechengxiangqing(String kechengxiangqing) {
		this.kechengxiangqing = kechengxiangqing;
	}
	
	/**
	 * 获取：课程详情
	 */
	public String getKechengxiangqing() {
		return kechengxiangqing;
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
			
}
