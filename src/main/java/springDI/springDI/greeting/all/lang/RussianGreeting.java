package springDI.springDI.greeting.all.lang;

import org.springframework.stereotype.Component;
import springDI.springDI.greeting.all.GreetingService;

@Component("russian")
public class RussianGreeting implements GreetingService {
    @Override
    public String greet(String name) {
        return "Здравствуйте, " + name + "!";
    }
}
