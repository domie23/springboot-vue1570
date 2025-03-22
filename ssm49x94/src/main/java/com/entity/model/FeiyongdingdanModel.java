package com.entity.model;

import com.entity.FeiyongdingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 费用订单
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-20 21:03:47
 */
public class FeiyongdingdanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 充电宝编号
	 */
	
	private String chongdianbaobianhao;
		
	/**
	 * 区域
	 */
	
	private String quyu;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 商户编号
	 */
	
	private String shanghubianhao;
		
	/**
	 * 商户名称
	 */
	
	private String shanghumingcheng;
		
	/**
	 * 开始时间
	 */
	
	private String kaishishijian;
		
	/**
	 * 结束时间
	 */
	
	private String jieshushijian;
		
	/**
	 * 每小时费用
	 */
	
	private String meixiaoshifeiyong;
		
	/**
	 * 租赁时长
	 */
	
	private String zulinshizhang;
		
	/**
	 * 租赁费用
	 */
	
	private String zulinfeiyong;
		
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
	 * 人员账号
	 */
	
	private String renyuanzhanghao;
		
	/**
	 * 人员姓名
	 */
	
	private String renyuanxingming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 
	public void setJieshushijian(String jieshushijian) {
		this.jieshushijian = jieshushijian;
	}
	
	/**
	 * 获取：结束时间
	 */
	public String getJieshushijian() {
		return jieshushijian;
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
	 * 设置：租赁时长
	 */
	 
	public void setZulinshizhang(String zulinshizhang) {
		this.zulinshizhang = zulinshizhang;
	}
	
	/**
	 * 获取：租赁时长
	 */
	public String getZulinshizhang() {
		return zulinshizhang;
	}
				
	
	/**
	 * 设置：租赁费用
	 */
	 
	public void setZulinfeiyong(String zulinfeiyong) {
		this.zulinfeiyong = zulinfeiyong;
	}
	
	/**
	 * 获取：租赁费用
	 */
	public String getZulinfeiyong() {
		return zulinfeiyong;
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
	 * 设置：人员账号
	 */
	 
	public void setRenyuanzhanghao(String renyuanzhanghao) {
		this.renyuanzhanghao = renyuanzhanghao;
	}
	
	/**
	 * 获取：人员账号
	 */
	public String getRenyuanzhanghao() {
		return renyuanzhanghao;
	}
				
	
	/**
	 * 设置：人员姓名
	 */
	 
	public void setRenyuanxingming(String renyuanxingming) {
		this.renyuanxingming = renyuanxingming;
	}
	
	/**
	 * 获取：人员姓名
	 */
	public String getRenyuanxingming() {
		return renyuanxingming;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
