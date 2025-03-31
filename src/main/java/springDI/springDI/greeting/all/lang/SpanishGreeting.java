package springDI.springDI.greeting.all.lang;

import org.springframework.stereotype.Component;
import springDI.springDI.greeting.all.GreetingService;

@Component("spanish")
public class SpanishGreeting implements GreetingService {
    @Override
    public String greet(String name) {
        return "¡Hola, " + name + "!";
    }
}
