package com.jinx.springboot;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.annotation.Resource;

/**
 * HelloController Tester.
 *
 * @author jinx
 * @since 04/09/2019
 * Desc:
 */
public class HelloControllerTest extends SuperControllerTest implements ControllerTest {

    @Resource
    private HelloController helloController;
    private MockMvc mockMvc;

    @Before
    @Override
    public void before() {
        mockMvc = getMockMvc(helloController);
    }

    /**
     * Method: index()
     */
    @Test
    public void testIndex() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string("Hello World"));
    }

} 
