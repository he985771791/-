package com.he.pojo;
/**
 * 
 * @类名：NoticeCategory
 * @描述：通知公告类别
 * @日期：2018年8月18日 下午7:04:32
 */
public class NoticeCategory extends Page {
    private Integer id;

    private String categoryName;

    private Integer parentId;

    private Byte isStop;

    private Integer categorySort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Byte getIsStop() {
        return isStop;
    }

    public void setIsStop(Byte isStop) {
        this.isStop = isStop;
    }

    public Integer getCategorySort() {
        return categorySort;
    }

    public void setCategorySort(Integer categorySort) {
        this.categorySort = categorySort;
    }
}