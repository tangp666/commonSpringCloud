package entity;

import javax.persistence.Id;

/**
 * 基础的实体对象
 * 主要储存 主键、排序、分页信息
 *
 * @author tangpan
 * @date 2020-10-22 13:27
 */
public class BaseEntity {

    //序列
    private static final long serialVersionUID = 1L;

    /** 主键id */
    @Id
    private Long id;
    /** 分页 */
    /** 当前第几页 */
    private int curPage;
    /** 一页多少条 */
    private int pageSize;
    /** 排序 */
    /**  排序方式 asc 顺序 desc 倒叙 */
    private String sort;
    /** 排序字段 */
    private String order;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
