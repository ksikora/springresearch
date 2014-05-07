package com.springapp.mvc.core;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunner {

    final static Logger logger = Logger.getLogger(MessageRunner.class);


    public static void main(String[] args) {
        logger.info("Initializing Spring context.");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/application-context.xml");

        logger.info("Spring context initialized.");

        Message message = (Message) applicationContext.getBean("message");

        logger.info("message='" + message.getMessage() + "'");
    }
}