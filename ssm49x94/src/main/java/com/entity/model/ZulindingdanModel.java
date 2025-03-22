package com.entity.model;

import com.entity.ZulindingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 租赁订单
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-20 21:03:47
 */
public class ZulindingdanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 充电宝编号
	 */
	
	private String chongdianbaobianhao;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 区域
	 */
	
	private String quyu;
		
	/**
	 * 商户编号
	 */
	
	private String shanghubianhao;
		
	/**
	 * 商户名称
	 */
	
	private String shanghumingcheng;
		
	/**
	 * 每小时费用
	 */
	
	private String meixiaoshifeiyong;
		
	/**
	 * 开始时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaishishijian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 用户手机
	 */
	
	private String yonghushouji;
				
	
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
	 * 设置：每小时费用
	 */
	 
	public void setMeixiaoshifeiyong(String meixiaoshifeiyong) {
		this.meixiaoshifeiyong = meixiaoshifeiyong;
	}
	
	/**
	 * 获取：每小时费用
	 */
	public String getMeixiaoshifeiyong() {
		return meixiaoshifeiyong;
	}
				
	
	/**
	 * 设置：开始时间
	 */
	 
	public void setKaishishijian(Date kaishishijian) {
		this.kaishishijian = kaishishijian;
	}
	
	/**
	 * 获取：开始时间
	 */
	public Date getKaishishijian() {
		return kaishishijian;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：用户手机
	 */
	 
	public void setYonghushouji(String yonghushouji) {
		this.yonghushouji = yonghushouji;
	}
	
	/**
	 * 获取：用户手机
	 */
	public String getYonghushouji() {
		return yonghushouji;
	}
			
}
