package com.shivu.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shivu.aop.config.AppConfig;
import com.shivu.aop.xl.XLReader;

/**
 * Hello world!
 */
public final class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        XLReader reader = context.getBean(XLReader.class);

        // XLReader reader = (XLReader) context.getBean("XLReader");
        // reader.readXLData();
    }
}
