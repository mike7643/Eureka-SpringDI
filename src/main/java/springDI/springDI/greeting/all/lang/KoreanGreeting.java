package springDI.springDI.greeting.all.lang;

import org.springframework.stereotype.Component;
import springDI.springDI.greeting.all.GreetingService;

@Component("korean")
public class KoreanGreeting implements GreetingService {
    @Override
    public String greet(String name) {
        return "안녕하세요, " + name + "님!";
    }
}
