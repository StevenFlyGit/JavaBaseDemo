package com.wpf.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 创建时间：2020/9/19
 * 用户数据Dao层
 * @author wpf
 */

public interface UserDao {
    @Select("select password from userInfo where username = #{xxx};")
    String queryPasswordByUsername(String username);

    @Select("select username from userInfo;")
    List<String> queryAllUserName();
}
