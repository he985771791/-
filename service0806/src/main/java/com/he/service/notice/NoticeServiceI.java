package com.he.service.notice;

import java.util.List;
import com.he.pojo.Notice;
import com.he.pojo.NoticeExample;
/**
 * 
 * @类名：NoticeServiceI
 * @描述：公告Service层接口
 * @日期：2018年8月18日 下午7:56:50
 */
public interface NoticeServiceI {
	//查询公告操作，noticeExample中包含sql语句的条件，notice中包含是否分页以及起始页与每页数据个数
	public List<Notice> getNotices(NoticeExample noticeExample , Notice notice);
	//通过id查询公告
	public Notice getNoticeById(int id);
	//插入一条公告记录
	public int insert(Notice notice);
	//更新一条公告记录
	public int update(Notice notice);
	//删除一条公告记录
	public int delete(int id);
}
