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
 * 充电宝投放
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-20 21:03:47
 */
@TableName("chongdianbaotoufang")
public class ChongdianbaotoufangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChongdianbaotoufangEntity() {
		
	}
	
	public ChongdianbaotoufangEntity(T t) {
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
	 * 充电宝编号
	 */
					
	private String chongdianbaobianhao;
	
	/**
	 * 商户编号
	 */
					
	private String shanghubianhao;
	
	/**
	 * 商户名称
	 */
					
	private String shanghumingcheng;
	
	/**
	 * 详细地址
	 */
					
	private String xiangxidizhi;
	
	/**
	 * 品牌
	 */
					
	private String pinpai;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 区域
	 */
					
	private String quyu;
	
	/**
	 * 每小时费用
	 */
					
	private Integer meixiaoshifeiyong;
	
	/**
	 * 剩余电量
	 */
					
	private Integer shengyudianliang;
	
	/**
	 * 投放时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date toufangshijian;
	
	
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
	 * 设置：充电宝编号
	 */
	public void setChongdianbaobianhao(String chongdianbaobianhao) {
		this.chongdianbaobianhao = chongdianbaobianhao;
	}
	/**
	 * 获取：充电宝编号
	 */
	public String getChongdianbaobianhao() {
		return chongdianbaobianhao;
	}
	/**
	 * 设置：商户编号
	 */
	public void setShanghubianhao(String shanghubianhao) {
		this.shanghubianhao = shanghubianhao;
	}
	/**
	 * 获取：商户编号
	 */
	public String getShanghubianhao() {
		return shanghubianhao;
	}
	/**
	 * 设置：商户名称
	 */
	public void setShanghumingcheng(String shanghumingcheng) {
		this.shanghumingcheng = shanghumingcheng;
	}
	/**
	 * 获取：商户名称
	 */
	public String getShanghumingcheng() {
		return shanghumingcheng;
	}
	/**
	 * 设置：详细地址
	 */
	public void setXiangxidizhi(String xiangxidizhi) {
		this.xiangxidizhi = xiangxidizhi;
	}
	/**
	 * 获取：详细地址
	 */
	public String getXiangxidizhi() {
		return xiangxidizhi;
	}
	/**
	 * 设置：品牌
	 */
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
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
	 * 设置：区域
	 */
	public void setQuyu(String quyu) {
		this.quyu = quyu;
	}
	/**
	 * 获取：区域
	 */
	public String getQuyu() {
		return quyu;
	}
	/**
	 * 设置：每小时费用
	 */
	public void setMeixiaoshifeiyong(Integer meixiaoshifeiyong) {
		this.meixiaoshifeiyong = meixiaoshifeiyong;
	}
	/**
	 * 获取：每小时费用
	 */
	public Integer getMeixiaoshifeiyong() {
		return meixiaoshifeiyong;
	}
	/**
	 * 设置：剩余电量
	 */
	public void setShengyudianliang(Integer shengyudianliang) {
		this.shengyudianliang = shengyudianliang;
	}
	/**
	 * 获取：剩余电量
	 */
	public Integer getShengyudianliang() {
		return shengyudianliang;
	}
	/**
	 * 设置：投放时间
	 */
	public void setToufangshijian(Date toufangshijian) {
		this.toufangshijian = toufangshijian;
	}
	/**
	 * 获取：投放时间
	 */
	public Date getToufangshijian() {
		return toufangshijian;
	}

}
