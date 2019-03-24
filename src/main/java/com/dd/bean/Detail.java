package com.dd.bean;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
public class Detail {

    private String id;

    private BigDecimal price;

    private Timestamp createTime;

    private Integer isCommit;

    private Timestamp  commitTime;

    private String userId;

    private Integer flag;

    private Timestamp createStartTime;

    private Timestamp createEndTime;

    private Timestamp commitStartTime;

    private Timestamp commitEndTime;

    private BigDecimal minPrice;

    private BigDecimal maxPrice;

}
