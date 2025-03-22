package com.entity.view;

import com.entity.GuihaidingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 归还订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-20 21:03:47
 */
@TableName("guihaidingdan")
public class GuihaidingdanView  extends GuihaidingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuihaidingdanView(){
	}
 
 	public GuihaidingdanView(GuihaidingdanEntity guihaidingdanEntity){
 	try {
			BeanUtils.copyProperties(this, guihaidingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
