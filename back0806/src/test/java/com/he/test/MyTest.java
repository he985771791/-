package com.he.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class MyTest {
	public static void main(String[] args) throws Exception {
		generator();

	}
	
	public static void generator() throws Exception{

	    List<String> warnings = new ArrayList<String>();
	    boolean overwrite = true;
	    //指定逆向工程配置文件
	    File configFile = new File(System.getProperty("user.dir")+"/src/test/resources/mybatis.xml");
	    System.out.println(System.getProperty("user.dir")+"/src/test/resources/mybatis.xml");
	    ConfigurationParser cp = new ConfigurationParser(warnings);
	    Configuration config = cp.parseConfiguration(configFile);
	    DefaultShellCallback callback = new DefaultShellCallback(overwrite);
	    MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
	            callback, warnings);
	    myBatisGenerator.generate(null);
	    System.out.println("生成完成");
	}
}
