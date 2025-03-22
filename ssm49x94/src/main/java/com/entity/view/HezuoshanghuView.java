package com.entity.view;

import com.entity.HezuoshanghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 合作商户
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-20 21:03:47
 */
@TableName("hezuoshanghu")
public class HezuoshanghuView  extends HezuoshanghuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HezuoshanghuView(){
	}
 
 	public HezuoshanghuView(HezuoshanghuEntity hezuoshanghuEntity){
 	try {
			BeanUtils.copyProperties(this, hezuoshanghuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
