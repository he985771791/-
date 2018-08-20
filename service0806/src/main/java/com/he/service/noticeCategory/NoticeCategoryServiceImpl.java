package com.he.service.noticeCategory;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.he.dao.NoticeCategoryMapper;
import com.he.pojo.NoticeCategory;
import com.he.pojo.NoticeCategoryExample;
/**
 * 
 * @类名：NoticeCategoryServiceImpl
 * @描述：[note]Service实现类
 * @日期：2018年8月18日 下午7:56:56
 */
@Service
public class NoticeCategoryServiceImpl implements NoticeCategoryServiceI {
	@Autowired
	NoticeCategoryMapper noticeCategoryMapper;
	@Override
	public List<NoticeCategory> getNoticeCategorys(NoticeCategoryExample noticeCategoryExample, NoticeCategory noticeCategory) {
		//如果withPage属性值为1代表要分页
		if(noticeCategory.getWithPage()==1) {
			PageHelper.startPage(noticeCategory.getPageNo(),noticeCategory.getPageSize());
		}
		return noticeCategoryMapper.selectByExample(noticeCategoryExample);
	}

	@Override
	public NoticeCategory getNoticeCategoryById(int id) {
		//通过id查询[note]
		return noticeCategoryMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insert(NoticeCategory noticeCategory) {
		//仅插入不为空指针的[note]数据
		return noticeCategoryMapper.insertSelective(noticeCategory);
	}

	@Override
	public int update(NoticeCategory noticeCategory) {
		//仅更新不为空指针的[note]数据
		return noticeCategoryMapper.updateByPrimaryKeySelective(noticeCategory);
	}

	@Override
	public int delete(int id) {
		//删除一条[note]记录
		return noticeCategoryMapper.deleteByPrimaryKey(id);
	}

}
