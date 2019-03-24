package com.dd;

import com.dd.dao.UserDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackageClasses = UserDao.class)
public class WaterPriceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaterPriceApplication.class, args);
    }

}
