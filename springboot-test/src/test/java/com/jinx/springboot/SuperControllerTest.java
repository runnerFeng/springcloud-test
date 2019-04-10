package com.jinx.springboot;

import com.jinx.SpringbootTestApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringbootTestApplication.class)
@AutoConfigureMockMvc
@WebAppConfiguration
public class SuperControllerTest {

    public MockMvc getMockMvc(Object... controllers) {
        return MockMvcBuilders.standaloneSetup(controllers).build();
    }

}
