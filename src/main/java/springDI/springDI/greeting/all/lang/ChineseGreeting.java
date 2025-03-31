package springDI.springDI.greeting.all.lang;

import org.springframework.stereotype.Component;
import springDI.springDI.greeting.all.GreetingService;

@Component("chinese")
public class ChineseGreeting implements GreetingService {
    @Override
    public String greet(String name) {
        return "你好, " + name + "!";
    }
}
