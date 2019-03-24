package com.dd.dao.provider;

import com.dd.bean.User;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.jdbc.SQL;

public class UserDaoProvider {

    public String listUsers (User user) {
        String sql = new SQL(){
            {
                SELECT("id, name, phone");
                FROM("t_user");
                WHERE("flag = 1");
                if (StringUtils.isNotBlank(user.getName())) {
                    AND();
                    WHERE(" name like '%'"+user.getName()+"'%' ");
                }
                if (StringUtils.isNotBlank(user.getPhone())) {
                    AND();
                    WHERE(" phone like '%'"+user.getPhone()+"'%' ");
                }
            }
        }.toString();
        return sql;
    }



}
