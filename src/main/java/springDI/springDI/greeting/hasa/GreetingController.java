package springDI.springDI.greeting.hasa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreetingController {

    private GreetingService greetingService;

    @Autowired
    public GreetingController(@Qualifier("koreanGreeting") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
