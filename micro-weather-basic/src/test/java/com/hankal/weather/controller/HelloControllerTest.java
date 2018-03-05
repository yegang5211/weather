package com.hankal.weather.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockSessionCookieConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.client.RequestMatcher;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by yegang5211 on 2018/3/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@AutoConfigureMockMvc
@SpringBootTest
public class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void hello1() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/weather/hello1").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                //.andExpect(content().contentType(MediaType.APPLICATION_JSON)) //验证响应contentType
                //.andExpect(jsonPath("$.hello").value(1)) //使用Json path验证JSON
                .andExpect(content().string(equalTo("hello1,world!")));
    }

    @Test
    public void hello2() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/weather/hello2").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("hello2,world!")));


    }

}