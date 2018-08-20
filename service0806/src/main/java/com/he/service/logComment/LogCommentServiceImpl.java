package com.he.service.logComment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.he.dao.LogCommentMapper;
import com.he.pojo.LogComment;
import com.he.pojo.LogCommentExample;
/**
 * 
 * @类名：LogCommentServiceImpl
 * @描述：[note]Service实现类
 * @日期：2018年8月18日 下午7:56:56
 */
@Service
public class LogCommentServiceImpl implements LogCommentServiceI {
	@Autowired
	LogCommentMapper logCommentMapper;
	@Override
	public List<LogComment> getLogComments(LogCommentExample logCommentExample, LogComment logComment) {
		//如果withPage属性值为1代表要分页
		if(logComment.getWithPage()==1) {
			PageHelper.startPage(logComment.getPageNo(),logComment.getPageSize());
		}
		return logCommentMapper.selectByExample(logCommentExample);
	}

	@Override
	public LogComment getLogCommentById(int id) {
		//通过id查询[note]
		return logCommentMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insert(LogComment logComment) {
		//仅插入不为空指针的[note]数据
		return logCommentMapper.insertSelective(logComment);
	}

	@Override
	public int update(LogComment logComment) {
		//仅更新不为空指针的[note]数据
		return logCommentMapper.updateByPrimaryKeySelective(logComment);
	}

	@Override
	public int delete(int id) {
		//删除一条[note]记录
		return logCommentMapper.deleteByPrimaryKey(id);
	}

}
