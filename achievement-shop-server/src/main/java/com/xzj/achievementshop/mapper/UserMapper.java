package com.xzj.achievementshop.mapper;

import com.xzj.achievementshop.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 15:02 2019/2/26
 */
public interface UserMapper extends BaseMapper<User> {
    User queryByUserName(@Param(value = "username") String username);
}
