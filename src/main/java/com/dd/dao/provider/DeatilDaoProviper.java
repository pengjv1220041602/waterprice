package com.dd.dao.provider;

import com.dd.bean.Detail;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.jdbc.SQL;

public class DeatilDaoProviper {

    public String updateDetail (Detail detail) {
        String sql = new SQL() {
            {
                UPDATE("t_detail");
                if (StringUtils.isNotBlank(detail.getUserId())) {
                    SET("user_id=#{userId}");
                }
                if (detail.getCommitTime() != null) {
                    SET("commit_time=#{commitTime}");
                }
                if (detail.getCreateTime() != null) {
                    SET("create_time = #{createTime}");
                }
                if (detail.getPrice() != null) {
                    SET("price = #{price}");
                }
                if (detail.getIsCommit() != null) {
                    SET("is_commit = #{isCommit}");
                }
                if (detail.getFlag() != null) {
                    SET("flag = #{flag}");
                }
                WHERE("id = #{id}");
            }
        }.toString();
        return sql;
    }


    public String listDetail(Detail detail) {

        String sql = new SQL(){
            {
                SELECT("id, price, user_id as userId, create_time as createTime, is_commit as isCommit, commit_date as commitDate");
                FROM("t_detail");
                WHERE("flag = 1");
                if (StringUtils.isNotBlank(detail.getUserId())) {
                    AND();
                    WHERE("user_id = #{userId}");
                }
                if (detail.getIsCommit() != null) {
                    AND();
                    WHERE("is_commit=#{isCommit}");
                }
                if (detail.getMinPrice() != null) {
                    AND();
                    WHERE("price >= #{minPrice}");
                }
                if (detail.getMaxPrice() != null) {
                    AND();
                    WHERE("price <= #{maxPrice}");
                }
                if (detail.getCreateStartTime() != null) {
                    AND();
                    WHERE("create_time >= #{createStartTime}");
                }
                if (detail.getCreateEndTime() != null) {
                    AND();
                    WHERE("create_time <= #{createEndTime}");
                }
                if (detail.getIsCommit() != null) {
                    AND();
                    WHERE("is_commit = #{isCommit}");
                }
                if(detail.getCommitStartTime() != null) {
                    AND();
                    WHERE("commit_date >= commitStartTime");
                }
                if(detail.getCommitEndTime() != null) {
                    AND();
                    WHERE("commit_date <= commitEndTime");
                }
            }
        }.toString();
        return sql;
    }


}
