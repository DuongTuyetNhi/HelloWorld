package autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojobeans.AccountService;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowire/beans.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
    }
}
