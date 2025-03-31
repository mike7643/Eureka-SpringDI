package springDI.springDI.greeting.all.lang;

import org.springframework.stereotype.Component;
import springDI.springDI.greeting.all.GreetingService;

@Component("english")
public class EnglishGreeting implements GreetingService {
    @Override
    public String greet(String name) {
        return "Hello, " + name +"!";
    }
}
