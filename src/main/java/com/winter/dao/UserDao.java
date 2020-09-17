package com.winter.dao;

import com.winter.domain.QueryVo;
import com.winter.domain.User;

import java.util.List;

//用户持久层接口
public interface UserDao {
    //查询所有用户
    List<User> findAll();
    //根据id查询用户
    User findById(Integer userId);
    //模糊查询
    List<User> findByName(String username);
    //根据QueryVo查询条件查询用户
    List<User> findUserByVo(QueryVo vo);
    //根据输入的参数条件查询,user就是查询的条件，可能只有其中一个属性，也可能都有或都没有
    List<User> findUserByCondition(User user);
    //根据QueryVo的id集合查询用户
    List<User> findUserInIds(QueryVo vo);
}
