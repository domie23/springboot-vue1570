package com.entity.model;

import com.entity.GuihaidingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 归还订单
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-20 21:03:47
 */
public class GuihaidingdanModel  implements Serializable {
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
	
	private String kaishishijian;
		
	/**
	 * 结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jieshushijian;
		
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
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 
	public void setKaishishijian(String kaishishijian) {
		this.kaishishijian = kaishishijian;
	}
	
	/**
	 * 获取：开始时间
	 */
	public String getKaishishijian() {
		return kaishishijian;
	}
				
	
	/**
	 * 设置：结束时间
	 */
	 
	public void setJieshushijian(Date jieshushijian) {
		this.jieshushijian = jieshushijian;
	}
	
	/**
	 * 获取：结束时间
	 */
	public Date getJieshushijian() {
		return jieshushijian;
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
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
