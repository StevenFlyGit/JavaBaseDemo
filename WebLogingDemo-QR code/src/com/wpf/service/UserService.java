package com.wpf.service;

import com.wpf.dao.UserDao;
import com.wpf.util.MybatisConnection;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 创建时间：2020/9/19
 * 处理用户数据的相关业务
 * @author wpf
 */

public class UserService {
    //获取会话连接
    private static SqlSession sqlSession = MybatisConnection.getSqlSession();
    //获取代理对象
    private static UserDao userDao = sqlSession.getMapper(UserDao.class);

    public static String queryPasswordByUsername(String username) {
        String password = userDao.queryPasswordByUsername(username);
        return password;
    }

    public static List<String> queryAllUserName() {
        return userDao.queryAllUserName();
    }


    public static void main(String[] args) {
        System.out.println(queryPasswordByUsername("jack"));
    }
}
