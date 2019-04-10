package com.jinx.springboot;

import org.junit.After;
import org.junit.Before;

/**
 * @author jinx
 * @date 2019/4/9 15:37
 * Desc:
 */
public interface ControllerTest {

    @Before
    void before();

    @After
    default void after(){
        //do nothing
    }
}
