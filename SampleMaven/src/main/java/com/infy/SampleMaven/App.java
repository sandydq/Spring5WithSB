package com.infy.SampleMaven;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MobileService mobileService = context.getBean("mobileService",MobileService.class);
        MobileService mobileService2 = context.getBean("mobileService",MobileService.class);
        System.out.println(mobileService.hashCode());
        System.out.println(mobileService2.hashCode());
        mobileService.sampleMethod();
        context.close();
    }
}
