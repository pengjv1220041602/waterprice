package com.dd.dao;

import com.dd.bean.User;
import com.dd.dao.provider.UserDaoProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {

    String DETAiL_USER = "name, phone, price, user_id as userId, create_time as createTime, is_commit as isCommit, commit_date as commitDate ";


    @Insert("insert into t_user(id, name, phone) values (#{id}, #{name}, #{phone})")
    int insertUser(User user);

    @Update("update t_user set (name=#{name}, phone=#{phone}) where id=#{id}")
    int updateUser (User user);

    @SelectProvider(type = UserDaoProvider.class, method = "listUsers")
    List<User> listUsers(User user);

    @Select("select " + DETAiL_USER +" from t_user left join t_detail on t_user.id = t_detail.user_id where t_user.id = #{id}")
    List<User> listDetailsByUserId (@Param("id") String id);

    @Select("select id, name, phone from t_user where id=#{id} and flag = 1")
    User userById(@Param("id")String id);

}