package springDI.springDI.greeting.all.lang;

import org.springframework.stereotype.Component;
import springDI.springDI.greeting.all.GreetingService;

@Component("german")
public class GermanGreeting implements GreetingService {
    @Override
    public String greet(String name) {
        return "Hallo, " + name + "!";
    }
}
