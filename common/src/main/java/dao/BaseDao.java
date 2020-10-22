package dao;

import java.util.List;
import java.util.Map;

/**
 * dao层公用类
 *
 * @author tangpan
 * @date 2020-10-22 14:10
 */
public interface BaseDao<T> {

    /**
     * 根据id信息查询实体对象
     * @param id
     * @return
     */
    T queryById(Long id);

    /**
     * 查询list集合
     * @param map
     * @return
     */
    List<T> queryList(Map<String,Object> map);

    /**
     * 查询实体对象数量
     * @param map
     * @return
     */
    int countList(Map<String,Object> map);

    /**
     * 修改
     * @param t 实体对象
     */
    void update(T t);

    /**
     * 删除
     * @param map 删除条件
     */
    void delete(Map<String, Object> map);

    /**
     * 插入
     * @param t 实体对象
     */
    void insert(T t);

}
