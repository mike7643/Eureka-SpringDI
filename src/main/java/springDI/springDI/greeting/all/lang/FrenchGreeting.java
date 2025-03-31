package springDI.springDI.greeting.all.lang;

import org.springframework.stereotype.Component;
import springDI.springDI.greeting.all.GreetingService;

@Component("french")
public class FrenchGreeting implements GreetingService {
    @Override
    public String greet(String name) {
        return "Bonjour, " + name + "!";
    }
}
