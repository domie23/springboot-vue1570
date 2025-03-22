package com.entity.view;

import com.entity.ChongdianbaoweihuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 充电宝维护
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-20 21:03:48
 */
@TableName("chongdianbaoweihu")
public class ChongdianbaoweihuView  extends ChongdianbaoweihuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongdianbaoweihuView(){
	}
 
 	public ChongdianbaoweihuView(ChongdianbaoweihuEntity chongdianbaoweihuEntity){
 	try {
			BeanUtils.copyProperties(this, chongdianbaoweihuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
