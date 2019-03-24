package com.dd.controller;

import com.dd.bean.BaseResponse;
import com.dd.bean.User;
import com.dd.service.IUserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/listuser")
    @ResponseBody
    public BaseResponse listUser(User user) {
        try {
            return new BaseResponse("200", "查询成功", userService.listUser(user), true);
        } catch (Exception e) {
            return new BaseResponse("500", "查询失败", "", false);
        }
    }

    @RequestMapping("/insertuser")
    @ResponseBody
    public BaseResponse insertuser(User user) {
        try {
            return new BaseResponse("200", "添加成功", "", true);
        } catch (Exception e) {
            return new BaseResponse("500", "添加失败", "", false);
        }
    }

    @RequestMapping("/updateuser")
    @ResponseBody
    public BaseResponse updatetuser(User user) {
        try {
            return new BaseResponse("200", "更新成功", "", true);
        } catch (Exception e) {
            return new BaseResponse("500", "更新失败", "", false);
        }
    }
}
