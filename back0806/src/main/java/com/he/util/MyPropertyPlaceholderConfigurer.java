package com.he.util;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
/**
 * 
 * @类名：MyPropertyPlaceholderConfigurer
 * @描述：继承PropertyPlaceholderConfigurer，用于解密db.properties中base64加密的字段
 * @作者：张赫赫
 * @日期：2018年8月16日 下午9:30:40
 */
public class MyPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer{
	@Override
	protected String convertProperty(String propertyName, String propertyValue) {
		// TODO Auto-generated method stub
		String result=propertyValue;
		if(propertyName.equals("username")||propertyName.equals("password")){
			result=DESUtils.decode(propertyValue);
		}
		return result;
	}
}
