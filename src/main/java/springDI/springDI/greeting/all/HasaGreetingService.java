package springDI.springDI.greeting.all;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HasaGreetingService {


/*


    //------------------------------------------------------------
    //Spring DI #1 field injection

    @Qualifier("russian")
    @Autowired
    GreetingService greetingService;
    public String greet(String name) {
        System.out.println("HasaGreeting.greet() - Field Injection");
        return greetingService.greet(name);
    }

*/


/*


    //------------------------------------------------------------
    //Spring DI #2 setter injection

    GreetingService greetingService;
    @Autowired
    public void setGreetingService(@Qualifier("japanese") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet(String name) {
        System.out.println("HasaGreeting.greet() - Setter Injection");
        return greetingService.greet(name);
    }
*/




    //------------------------------------------------------------
    //Spring DI #3 constructor injection

    GreetingService greetingService;

    @Autowired // 생성자 주입일 때는 안 붙혀도 됨.
    public HasaGreetingService(@Qualifier("spanish") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet(String name) {
        System.out.println("HasaGreeting.greet() - Constructor Injection");
        return greetingService.greet(name);
    }
}
