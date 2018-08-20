package com.he.test;

import java.util.Properties;
import java.util.Set;

public class AutoUtils {
	//实体所在包
	public static String PACKAGE="com.he.pojo";
	//项目所在的全路径+"\src\main\java\"
	public static String BASEPATH=System.getProperty("user.dir")+"\\src\\main\\java\\";
	//项目所在的全路径+"\src\main\resources\"dao层mepper文件所在的目录
	public static String RESOURCESPATH=System.getProperty("user.dir")+"\\src\\main\\resources\\";
	
	//实体名称,需要自己设置
	public static String CLASSNAME="WorkflowStepDetail";
	//实体中文名称，用于注释,需要自己设置
	public static String NOTENAME="流程步骤详情";
	
	//实体对象名,通过实体名称转换，首字母变小写其他不变
	public static String OBJECTNAME=CLASSNAME.substring(0, 1).toLowerCase()+CLASSNAME.substring(1);
	//dao接口的目录:全路径
	public static String DAOINTERFACE="com/he/dao/";
	//service接口的目录：全路径
	public static String SERVICEINTERFACE="com/he/service/";
	//模板文件所在的路径
	public static String TMPPATH=System.getProperty("user.dir")+"\\src\\test\\java\\com\\he\\tmp\\";
	public static void main(String[] args) {
		//实体对象名
		//System.out.println(OBJECTNAME); 
		//显示Properties类的属性
/*		Properties properties =System.getProperties();
		Set<Object> keySet = properties.keySet();
		for (Object key : keySet) {
			System.out.println(key.toString()+"---------"+properties.get(key));
		}*/
		
		//获取Properties类的user.dir属性
		//System.out.println(System.getProperty("user.dir")+"\\src\\main\\java\\");
		//生成Dao层接口
		//AutoDao.autoInterface();
		//AutoDao.autoMapper();
		AutoService.autoInterface();
		AutoService.autoImpl();
	}
}
