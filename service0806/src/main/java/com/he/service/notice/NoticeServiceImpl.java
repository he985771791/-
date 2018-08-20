package com.he.service.notice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.he.dao.NoticeMapper;
import com.he.pojo.Notice;
import com.he.pojo.NoticeExample;
/**
 * 
 * @类名：NoticeServiceImpl
 * @描述：[note]Service实现类
 * @日期：2018年8月18日 下午7:56:56
 */
@Service
public class NoticeServiceImpl implements NoticeServiceI {
	@Autowired
	NoticeMapper noticeMapper;
	@Override
	public List<Notice> getNotices(NoticeExample noticeExample, Notice notice) {
		//如果withPage属性值为1代表要分页
		if(notice.getWithPage()==1) {
			PageHelper.startPage(notice.getPageNo(),notice.getPageSize());
		}
		return noticeMapper.selectByExample(noticeExample);
	}

	@Override
	public Notice getNoticeById(int id) {
		//通过id查询[note]
		return noticeMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insert(Notice notice) {
		//仅插入不为空指针的[note]数据
		return noticeMapper.insertSelective(notice);
	}

	@Override
	public int update(Notice notice) {
		//仅更新不为空指针的[note]数据
		return noticeMapper.updateByPrimaryKeySelective(notice);
	}

	@Override
	public int delete(int id) {
		//删除一条[note]记录
		return noticeMapper.deleteByPrimaryKey(id);
	}

}
