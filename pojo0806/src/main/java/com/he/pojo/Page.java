package com.he.pojo;

import lombok.Data;
/**
 * 
 * @类名：Page
 * @描述：分页父类，所有pojo继承Page
 * @作者：张赫赫
 * @日期：2018年8月18日 下午7:05:06
 */
@Data
public class Page {
	//当前页是第几页
	private Integer pageNo=1;
	//每页有几个数据
	private Integer pageSize=10;
	//是否要分页,默认为1要分页
	private Integer withPage=1;
	
}
