package beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanlifecycle/beans.xml");
        BeanLifeCycle beanLifeCycle = applicationContext.getBean("beanLifeCycle", BeanLifeCycle.class);
        applicationContext.close();
    }
}
