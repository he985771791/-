package com.he.service.noticeCategory;

import java.util.List;
import com.he.pojo.NoticeCategory;
import com.he.pojo.NoticeCategoryExample;
/**
 * 
 * @类名：NoticeCategoryServiceI
 * @描述：公告类别Service层接口
 * @日期：2018年8月18日 下午7:56:50
 */
public interface NoticeCategoryServiceI {
	//查询公告类别操作，noticeCategoryExample中包含sql语句的条件，noticeCategory中包含是否分页以及起始页与每页数据个数
	public List<NoticeCategory> getNoticeCategorys(NoticeCategoryExample noticeCategoryExample , NoticeCategory noticeCategory);
	//通过id查询公告类别
	public NoticeCategory getNoticeCategoryById(int id);
	//插入一条公告类别记录
	public int insert(NoticeCategory noticeCategory);
	//更新一条公告类别记录
	public int update(NoticeCategory noticeCategory);
	//删除一条公告类别记录
	public int delete(int id);
}
