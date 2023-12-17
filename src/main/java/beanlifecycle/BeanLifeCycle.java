package beanlifecycle;

public class BeanLifeCycle {
    public void init(){
        System.out.println("Init method is called");
    }
    public void destroy(){
        System.out.println("Destroy method is called");
    }
}
