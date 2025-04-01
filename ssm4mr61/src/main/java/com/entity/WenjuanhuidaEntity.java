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
 * 问卷回答
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-17 22:22:47
 */
@TableName("wenjuanhuida")
public class WenjuanhuidaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WenjuanhuidaEntity() {
		
	}
	
	public WenjuanhuidaEntity(T t) {
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
	 * 问卷编号
	 */
					
	private String wenjuanbianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
	
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
	 * 设置：问卷编号
	 */
	public void setWenjuanbianhao(String wenjuanbianhao) {
		this.wenjuanbianhao = wenjuanbianhao;
	}
	/**
	 * 获取：问卷编号
	 */
	public String getWenjuanbianhao() {
		return wenjuanbianhao;
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
