package com.he.service.logComment;

import java.util.List;
import com.he.pojo.LogComment;
import com.he.pojo.LogCommentExample;
/**
 * 
 * @类名：LogCommentServiceI
 * @描述：日志评论Service层接口
 * @日期：2018年8月18日 下午7:56:50
 */
public interface LogCommentServiceI {
	//查询日志评论操作，logCommentExample中包含sql语句的条件，logComment中包含是否分页以及起始页与每页数据个数
	public List<LogComment> getLogComments(LogCommentExample logCommentExample , LogComment logComment);
	//通过id查询日志评论
	public LogComment getLogCommentById(int id);
	//插入一条日志评论记录
	public int insert(LogComment logComment);
	//更新一条日志评论记录
	public int update(LogComment logComment);
	//删除一条日志评论记录
	public int delete(int id);
}
