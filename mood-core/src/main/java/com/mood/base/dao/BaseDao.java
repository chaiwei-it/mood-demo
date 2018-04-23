package com.mood.base.dao;

import com.mood.base.Pager;
import com.mood.entity.user.User;
import net.sf.json.JSONObject;

import java.util.List;

/**
 * 内容
 * @author chaiwei
 * @time 2018-01-07 下午08:00
 */
public interface BaseDao<T> {

    /**
     * fetch data by rule id
     *
     * @param t rule id
     * @return Result<XxxxDO>
     */
    public int insert(T t);

    /**
     * fetch data by rule id
     *
     * @param t rule id
     * @return Result<XxxxDO>
     */
    public int update(T t);

    /**
     * fetch data by rule id
     *
     * @param id rule id
     * @return Result<XxxxDO>
     */
    public int deleteById(String id);

    /**
     * fetch data by rule id
     *
     * @param id rule id
     * @return Result<XxxxDO>
     */
    public T selectById(String id);

    /**
     * fetch data by rule id
     *
     * @param param rule id
     * @return Result<XxxxDO>
     */
    public List<T> selectAll(JSONObject param);

    /**
     * fetch data by rule id
     *
     * @param pager rule id
     * @return Result<XxxxDO>
     */
    public Pager<T> selectPager(Pager pager);
}
