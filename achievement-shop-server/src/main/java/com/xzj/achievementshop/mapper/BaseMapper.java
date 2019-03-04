package com.xzj.achievementshop.mapper;

import java.util.List;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 17:21 2019/2/26
 */
public interface BaseMapper<T> {
    List<T> getAll();

    void insert(T t);

    void update(T t);

    void delete(long id);
}
