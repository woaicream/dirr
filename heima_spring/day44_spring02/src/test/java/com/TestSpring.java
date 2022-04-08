package com;

import learnmyself.UserSerivce;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//使用spring 进行ioc   由spring容器去加载spring的配置文件
//从而创建出由使用者 想要的所有对象
public class TestSpring {
    @Test
    public void test01(){
//         ClassPathXmlApplicationContext spring核心容器的实现类
        ApplicationContext act=new ClassPathXmlApplicationContext("spring.xml");
//重核心容器里面获取你想要的对象
        UserSerivce userSerivce=(UserSerivce) act.getBean("userServiceImpl");

   //多态的作用 1.解耦 2.扩展
        userSerivce.adduser();
        }
}
