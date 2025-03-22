package com.entity.view;

import com.entity.FeiyongdingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 费用订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-20 21:03:47
 */
@TableName("feiyongdingdan")
public class FeiyongdingdanView  extends FeiyongdingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FeiyongdingdanView(){
	}
 
 	public FeiyongdingdanView(FeiyongdingdanEntity feiyongdingdanEntity){
 	try {
			BeanUtils.copyProperties(this, feiyongdingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
