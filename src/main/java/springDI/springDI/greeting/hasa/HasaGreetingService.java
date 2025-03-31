package springDI.springDI.greeting.hasa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HasaGreetingService {

    //------------------------------------------------------------
    //Spring DI #1 field injection
    @Qualifier("englishGreeting")
    @Autowired
    GreetingService greetingService1;

    public String greet1(String name) {
        System.out.println("HasaGreeting.greet1() - Field Injection");
        return greetingService1.greet(name);
    }

    //------------------------------------------------------------
    //Spring DI #2 setter injection
    GreetingService greetingService2;

    @Autowired
    public void setGreetingService(@Qualifier("englishGreeting") GreetingService greetingService) {
        this.greetingService2 = greetingService;
    }

    public String greet2(String name) {
        System.out.println("HasaGreeting.greet2() - Setter Injection");
        return greetingService2.greet(name);
    }

    //------------------------------------------------------------
    //Spring DI #3 constructor injection
    GreetingService greetingService3;

    @Autowired // 생성자 주입일 때는 안 붙혀도 됨.
    public HasaGreetingService(@Qualifier("englishGreeting") GreetingService greetingService) {
        this.greetingService3 = greetingService;
    }

    public String greet3(String name) {
        System.out.println("HasaGreeting.greet3() - Constructor Injection");
        return greetingService3.greet(name);
    }
}
