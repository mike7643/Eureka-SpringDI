package springDI.springDI.greeting.all.lang;

import org.springframework.stereotype.Component;
import springDI.springDI.greeting.all.GreetingService;

@Component("japanese")
public class JapaneseGreeting implements GreetingService {
    @Override
    public String greet(String name) {
        return "こんにちは, " + name + "!";
    }
}
