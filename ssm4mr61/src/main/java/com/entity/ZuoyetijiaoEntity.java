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
 * 作业提交
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-17 22:22:47
 */
@TableName("zuoyetijiao")
public class ZuoyetijiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZuoyetijiaoEntity() {
		
	}
	
	public ZuoyetijiaoEntity(T t) {
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
	 * 作业编号
	 */
					
	private String zuoyebianhao;
	
	/**
	 * 课程名称
	 */
					
	private String kechengmingcheng;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 作业名称
	 */
					
	private String zuoyemingcheng;
	
	/**
	 * 老师工号
	 */
					
	private String laoshigonghao;
	
	/**
	 * 老师姓名
	 */
					
	private String laoshixingming;
	
	/**
	 * 作业附件
	 */
					
	private String zuoyefujian;
	
	/**
	 * 作业内容
	 */
					
	private String zuoyeneirong;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 提交时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tijiaoshijian;
	
	
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
	 * 设置：作业编号
	 */
	public void setZuoyebianhao(String zuoyebianhao) {
		this.zuoyebianhao = zuoyebianhao;
	}
	/**
	 * 获取：作业编号
	 */
	public String getZuoyebianhao() {
		return zuoyebianhao;
	}
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
	 * 设置：作业名称
	 */
	public void setZuoyemingcheng(String zuoyemingcheng) {
		this.zuoyemingcheng = zuoyemingcheng;
	}
	/**
	 * 获取：作业名称
	 */
	public String getZuoyemingcheng() {
		return zuoyemingcheng;
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
	 * 设置：作业附件
	 */
	public void setZuoyefujian(String zuoyefujian) {
		this.zuoyefujian = zuoyefujian;
	}
	/**
	 * 获取：作业附件
	 */
	public String getZuoyefujian() {
		return zuoyefujian;
	}
	/**
	 * 设置：作业内容
	 */
	public void setZuoyeneirong(String zuoyeneirong) {
		this.zuoyeneirong = zuoyeneirong;
	}
	/**
	 * 获取：作业内容
	 */
	public String getZuoyeneirong() {
		return zuoyeneirong;
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
	 * 设置：提交时间
	 */
	public void setTijiaoshijian(Date tijiaoshijian) {
		this.tijiaoshijian = tijiaoshijian;
	}
	/**
	 * 获取：提交时间
	 */
	public Date getTijiaoshijian() {
		return tijiaoshijian;
	}

}
