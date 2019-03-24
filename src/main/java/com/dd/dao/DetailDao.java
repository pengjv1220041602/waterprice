package com.dd.dao;

import com.dd.bean.Detail;
import com.dd.dao.provider.DeatilDaoProviper;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DetailDao {

    @Insert("insert into t_detail(id, price, user_id, create_time, is_commit, commit_date, flag) values (#{id}, #{price}, #{userId}, #{createTime}, #{isCommit}, #{commitDate}, #{flag})")
    int insertDetail (Detail detail);

    @UpdateProvider(type = DeatilDaoProviper.class, method = "updateDetail")
    int updateDetail(Detail detail);

    @SelectProvider(type = DeatilDaoProviper.class, method = "listDetail")
    List<Detail> listDetail(Detail detail);

    @Select("select id, price, user_id as userId, create_time as createTime, is_commit as isCommit, commit_date as commitDate from t_detail where id = #{id} and flag = 1")
    Detail detailById(@Param("id") String id);

}
