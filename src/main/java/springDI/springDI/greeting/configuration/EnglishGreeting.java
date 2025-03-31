package springDI.springDI.greeting.configuration;

import org.springframework.stereotype.Component;

@Component
public class EnglishGreeting implements GreetingService {
    @Override
    public String greet(String name) {
        return "Hello, " + name +"!";
    }
}
