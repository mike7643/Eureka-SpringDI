package springDI.springDI.greeting.all;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import springDI.springDI.calc.hasa.HasaCalculator;
import springDI.springDI.greeting.hasa.GreetingService;

@Component
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("greetingxml/all-greeting-annotation.xml");
        HasaGreetingService hasaGreetingService = (HasaGreetingService) cxt.getBean("hasaGreetingService");
        System.out.println(hasaGreetingService.greet("정유민"));
    }
}
