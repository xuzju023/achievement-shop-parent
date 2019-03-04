package com.xzj.achievementshop.service;

import java.util.List;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 17:21 2019/2/26
 */
public interface BaseService<T> {
    List<T> getAll();

    void insert(T t);

    void update(T t);

    void delete(long id);
}
