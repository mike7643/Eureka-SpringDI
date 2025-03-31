package springDI.springDI.greeting.hasa;

import org.springframework.stereotype.Component;

@Component
public class KoreanGreeting implements GreetingService {
    @Override
    public String greet(String name) {
        return "안녕하세요, " + name + "님!";
    }
}
