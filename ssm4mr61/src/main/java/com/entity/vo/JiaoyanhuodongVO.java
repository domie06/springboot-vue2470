package com.entity.vo;

import com.entity.JiaoyanhuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 教研活动
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-17 22:22:47
 */
public class JiaoyanhuodongVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 相关照片
	 */
	
	private String xiangguanzhaopian;
		
	/**
	 * 主要内容
	 */
	
	private String zhuyaoneirong;
		
	/**
	 * 活动概要
	 */
	
	private String huodonggaiyao;
		
	/**
	 * 活动小结
	 */
	
	private String huodongxiaojie;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
				
	
	/**
	 * 设置：相关照片
	 */
	 
	public void setXiangguanzhaopian(String xiangguanzhaopian) {
		this.xiangguanzhaopian = xiangguanzhaopian;
	}
	
	/**
	 * 获取：相关照片
	 */
	public String getXiangguanzhaopian() {
		return xiangguanzhaopian;
	}
				
	
	/**
	 * 设置：主要内容
	 */
	 
	public void setZhuyaoneirong(String zhuyaoneirong) {
		this.zhuyaoneirong = zhuyaoneirong;
	}
	
	/**
	 * 获取：主要内容
	 */
	public String getZhuyaoneirong() {
		return zhuyaoneirong;
	}
				
	
	/**
	 * 设置：活动概要
	 */
	 
	public void setHuodonggaiyao(String huodonggaiyao) {
		this.huodonggaiyao = huodonggaiyao;
	}
	
	/**
	 * 获取：活动概要
	 */
	public String getHuodonggaiyao() {
		return huodonggaiyao;
	}
				
	
	/**
	 * 设置：活动小结
	 */
	 
	public void setHuodongxiaojie(String huodongxiaojie) {
		this.huodongxiaojie = huodongxiaojie;
	}
	
	/**
	 * 获取：活动小结
	 */
	public String getHuodongxiaojie() {
		return huodongxiaojie;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
			
}
