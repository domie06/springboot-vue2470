package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 教研活动
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-17 22:22:47
 */
@TableName("jiaoyanhuodong")
public class JiaoyanhuodongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoyanhuodongEntity() {
		
	}
	
	public JiaoyanhuodongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 主题
	 */
					
	private String zhuti;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：主题
	 */
	public void setZhuti(String zhuti) {
		this.zhuti = zhuti;
	}
	/**
	 * 获取：主题
	 */
	public String getZhuti() {
		return zhuti;
	}
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
