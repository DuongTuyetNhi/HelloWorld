package beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTestAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanlifecycle/annotation.xml");
        BeanLifeCycleAnnotation beanLifeCycleAnnotation = applicationContext.getBean("beanLifeCycleAnnotation", BeanLifeCycleAnnotation.class);
        applicationContext.close();
    }
}
