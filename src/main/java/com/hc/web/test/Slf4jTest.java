package com.hc.web.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class Slf4jTest {

//    static {
//        PropertyConfigurator.configure(Slf4jTest.class.getClassLoader().getResource("/src/main/log4j.properties"));
//    }

    protected static Logger logger = LoggerFactory.getLogger(Slf4jTest.class);

    public static void main(String[] args) {

        logger.debug("这是个测试时间{}" + new Date());
    }
}
