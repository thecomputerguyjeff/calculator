package com.ti.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CalculatorApplication.class)
public class CalculatorControllerIT {

    @Autowired
    private WebApplicationContext webAppContext;

    private MockMvc mvc;

    @Before
    public void setup() {
         mvc = webAppContextSetup(webAppContext)
                .defaultRequest(get("/")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON))
                .build();
    }

    @Test
    public void getRequestToApiAddWithPathVariables1And2Returns3() throws Exception {
        String path = "/api/add/1/2";

        MvcResult result = mvc.perform(get(path)).andExpect(status().isOk()).andReturn();

        assertThat(result.getResponse().getContentAsString()).isEqualTo("3");


    }

    @Test
    public void getRequestToApiDivideWithPathVariables18and9returns2() throws Exception {
        String path = "/api/divide/18/9";
        MvcResult result = mvc.perform(get(path)).andExpect(status().isOk()).andReturn();
        assertThat(result.getResponse().getContentAsString()).isEqualTo("2");
    }

    @Test
    public void getRequestToApiMultiplyWithPathVariables4And3Returns12() throws Exception{
        String path="/api/multiply/4/3";
        MvcResult result=mvc.perform(get(path)).andExpect(status().isOk()).andReturn();
        assertThat(result.getResponse().getContentAsString()).isEqualTo("12");
    }

}