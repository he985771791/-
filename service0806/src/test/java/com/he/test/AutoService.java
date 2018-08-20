package com.he.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class AutoService {
	//自动生成Service层接口
	public static void autoInterface() {
		File pack = new File(AutoUtils.BASEPATH+AutoUtils.SERVICEINTERFACE+AutoUtils.OBJECTNAME);
		if(!pack.exists()) {
			pack.mkdirs();//mkdirs有s代表递归创建，无论如何都会创建处理
		}
		File file=new File(AutoUtils.BASEPATH+AutoUtils.SERVICEINTERFACE+AutoUtils.OBJECTNAME+"/"+AutoUtils.CLASSNAME+"ServiceI.java");
		File tmpFile=new File(AutoUtils.TMPPATH+"serviceInterfaceTmp");
		if(!file.exists()) {
			try {
				file.createNewFile();
				String tmpStr = FileUtils.readFileToString(tmpFile);
				String newStr = tmpStr.replaceAll("\\[ClassName\\]", AutoUtils.CLASSNAME)
						.replaceAll("\\[objName\\]", AutoUtils.OBJECTNAME)
						.replaceAll("\\[note\\]", AutoUtils.NOTENAME);
				//System.out.println(newStr);
				FileUtils.writeStringToFile(file, newStr, "UTF-8");
				System.out.println("Service接口创建成功！！");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("Service接口已经存在！！");
		}
	}
	//自动生成Service层实现类
	public static void autoImpl() {
		File pack = new File(AutoUtils.BASEPATH+AutoUtils.SERVICEINTERFACE+AutoUtils.OBJECTNAME);
		if(!pack.exists()) {
			pack.mkdirs();//mkdirs有s代表递归创建，无论如何都会创建处理
		}
		File file=new File(AutoUtils.BASEPATH+AutoUtils.SERVICEINTERFACE+AutoUtils.OBJECTNAME+"/"+AutoUtils.CLASSNAME+"ServiceImpl.java");
		File tmpFile=new File(AutoUtils.TMPPATH+"serviceImplTmp");
		if(!file.exists()) {
			try {
				file.createNewFile();
				String tmpStr = FileUtils.readFileToString(tmpFile);
				String newStr = tmpStr.replaceAll("\\[ClassName\\]", AutoUtils.CLASSNAME)
						.replaceAll("\\[objName\\]", AutoUtils.OBJECTNAME)
						.replaceAll("\\[Note\\]", AutoUtils.NOTENAME);
				//System.out.println(newStr);
				FileUtils.writeStringToFile(file, newStr, "UTF-8");
				System.out.println("Service实现类创建成功！！");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("Service实现类已经存在！！");
		}
	}
}
