package com.dd.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserControllerTest {

    private MockMvc mockMvc; //2 模拟MVC对象

    @Autowired
    private WebApplicationContext wac; //4 注入WebApplicationContext

    @Before //7 测试开始前的初始化工作
    public void setup() {
        mockMvc =
                MockMvcBuilders.webAppContextSetup(this.wac).build(); //2
    }

    @Test
    public void listUser() throws Exception {
        final String contentAsString = mockMvc.perform(get("/user/listuser")).andReturn().getResponse().getContentAsString();
        System.out.println(contentAsString);
    }
}