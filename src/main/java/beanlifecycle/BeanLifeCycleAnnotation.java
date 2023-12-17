package beanlifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class BeanLifeCycleAnnotation {
    @PostConstruct
    public void init(){
        System.out.println("Init method is called");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Destroy method is called");
    }
}
